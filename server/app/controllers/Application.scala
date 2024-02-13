package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def stuff(num: Int, msg: String) = Action{
    Ok(views.html.index(s"Here is the number you chose: $num, and here is the message you thought of: $msg"))
  }

}
