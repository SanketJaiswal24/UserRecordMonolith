import groovy.io.FileType

//the same chages is happen
// How to create the fucationssss
void mycommacode()
{
    File fh2 = new File("fileContent.txt")
   def lines = fh2.readLines()
    for (line in lines) {
     println line
 }
}
