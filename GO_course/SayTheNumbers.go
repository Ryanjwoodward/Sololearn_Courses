package main
import "fmt"


func switchfunc(o int){
    switch o{
      case 1: fmt.Println("One")
      case 2:fmt.Println("Two")
      case 3: fmt.Println("Three")
      case 4:fmt.Println("Four")
      case 5: fmt.Println("Five")
      case 6:fmt.Println("Six")
      case 7: fmt.Println("Seven")
      case 8:fmt.Println("Eight")
      case 9: fmt.Println("Nine")
      case 10: fmt.Println("Ten")
      default: fmt.Println("Zero")
   }   
}


func main() {
    var i,m,n int
    fmt.Scanln(&i)
    fmt.Scanln(&m)
    fmt.Scanln(&n)
    switchfunc(i)
    switchfunc(m)
    switchfunc(n)
    
}
