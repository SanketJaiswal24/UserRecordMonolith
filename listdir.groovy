import groovy.io.FileType

// create the mono repo
// The man
//The added
void mycommacode()
{
    File fh2 = new File("fileContent.txt")
   def lines = fh2.readLines()
    for (line in lines) {
     println line
 }
}
