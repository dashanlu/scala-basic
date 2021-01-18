package extractor

/**
 * Created by mengwang on 07/12/2014.
 */
//case class Email{
//
//}
object Email {
  //optional
  def apply(name: String, domain: String): Unit = {
    name + "@" + domain
  }

  //mandatory
  def unapply(email: String): Option[(String, String)] = {
    val parts = email.split("@")
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }

  def main(args: Array[String]) {
    var email = "dashanlu@gmail.com"

    //implicit
    email match {
      case Email(user, domain) => println(user + " AT " + domain)
      case _ => printf("it is not a valid email")
    }

    email = "dashanlu"

    email match {
      case Email(user, domain) => println(user + " AT " + domain)
      case _ => printf("it is not a valid email")
    }
  }
}
