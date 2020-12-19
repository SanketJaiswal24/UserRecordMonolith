import groovy.io.FileType

// How to create the fucation
void mycommacode()
{
    File fh2 = new File("fileContent.txt")
   def lines = fh2.readLines()
    for (line in lines) {
     println line
 }
}
