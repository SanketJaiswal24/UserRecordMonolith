import groovy.io.FileType

// create the mono repo
void mycommacode()
{
    File fh2 = new File("fileContent.txt")
   def lines = fh2.readLines()
    for (line in lines) {
     println line
 }
}
