package myjavaexamples.apacheFileIO;
//import apache io packages

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basics {
    //create main method
    
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        //https://www.tutorialspoint.com/what-is-a-stream-and-what-are-the-types-of-streams-and-classes-in-java
        //https://www.tutorialspoint.com/commons_io/commons_io_fileutils.htm
        try(InputStream in = new FileInputStream("D:/test.txt")) {
            System.out.println( IOUtils.toString( in , "UTF-8") );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //testware root as we discussed
        File currentDirectory = new File("D:\\l3c\\testme");
        //to get xml root directory
        DocumentBuilderFactory fact =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();

        //getting all filed and folder from in parent testcase/l3c/
        List<File> parentDir = (List<File>) FileUtils.listFiles(currentDirectory, new String[]{"xml"}, false);
        // deleting unwanted files if exist in parent testcase/l3c/
        for (File file : parentDir) {
            if(file.exists())
            file.delete();
        }

        // getting xml files from subdiretories
        List<File> files = (List<File>) FileUtils.listFiles(currentDirectory, new String[]{"xml"}, true);
        // grouping files based on file name
        Map<String,List<File>> groupedbyName=files.stream().collect(Collectors.groupingBy(File::getName, Collectors.toList()));
        for (Map.Entry<String, List<File>> entry : groupedbyName.entrySet()) {
            List<File> fileEntries=entry.getValue();
            //if only file exist in that name copy it else loop through files
            if(fileEntries.size()==1){
                FileUtils.copyFileToDirectory(fileEntries.get(0),currentDirectory);
            }else{
                File newFile=FileUtils.getFile(currentDirectory.getAbsoluteFile()+File.separator+entry.getKey());
                String data="";

                for(int i=0;i<fileEntries.size();i++){
                    String tempData= FileUtils.readFileToString(fileEntries.get(i), Charset.defaultCharset());
                    Document doc = builder.parse(fileEntries.get(0));
                    Node node = doc.getDocumentElement();
                    //getting root tag to replace in the file
                    String rootStart = "<"+node.getNodeName()+">";
                    String rootEnd = "</"+node.getNodeName()+">";
                    //no parser used here if first file convert to string and add that to data
                    if(i==0){
                        tempData=tempData.replace(rootEnd,"");
                    }else if(i==fileEntries.size()-1){
                        tempData=tempData.replaceAll("<\\?xml([^>]+)>","");
                        tempData=tempData.replace(rootStart,"");
                    }else {
                        tempData=tempData.replaceAll("<\\?xml([^>]+)>","");
                        tempData=tempData.replace(rootStart,"");
                        tempData=tempData.replace(rootEnd,"");
                    }

                    data+=tempData;
                }
                //writing data to file
                FileUtils.writeStringToFile(newFile,data,Charset.defaultCharset());
                System.out.println(newFile.getAbsolutePath());
            }

        }

    }
}