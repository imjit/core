package controllers

import play.api._
import play.api.mvc._


object CoreAppController extends Controller {


  def index = Action {
    Ok(views.html.index())
  }


  def main2 = Action {
    Ok(views.html.main2())
  }
}