
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object payment_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.124*/("""


"""),_display_(/*4.2*/main("Payment", user, categories, catId, filter)/*4.50*/  {_display_(Seq[Any](format.raw/*4.53*/("""


	"""),format.raw/*7.2*/("""<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Payment</h2>
				<div id="accordian">
					<div class="col-sm-8 col-sm-offset-1">

					
						<div class="form-group col-sm-8">
							<label for="usr">Card Number:</label>
							<input type="text" class="form-control" id="usr">
						</div>
					

				
						<div class="form-group col-sm-8">
							<label for="usr">Expiration Date:</label>
							<select class="form-control" id="sel1">
   							<option>1</option>
   							<option>2</option>
   							<option>3</option>
  							<option>4</option>
   							<option>5</option>
   							<option>6</option>
   							<option>7</option>
  							<option>8</option>
   							<option>9</option>
   							<option>10</option>
   							<option>11</option>
  							<option>12</option>
 						</select>
						</div>

						<div class="form-group col-sm-8">
						<select class="form-control " id="sel1">
   							<option>2017</option>
   							<option>2018</option>
   							<option>2019</option>
  							<option>2020</option>
   							<option>2021</option>
   							
 						</select>
						</div>
						
					
						<div class="form-group col-sm-8">
							<label for="usr">First Name:</label>
							<input type="text" class="form-control" id="usr">
						</div>
								
						<div class="form-group col-sm-8">
							<label for="usr">Last Name:</label>
							<input type="text" class="form-control" id="usr">
						</div>

						<div class="form-group col-sm-8">
							<label for="usr">Security Code:</label>
							<input type="text" class="form-control" id="usr">
						</div>
						<div class="form-group col-sm-6">
							<label for="usr">Address:</label>
							<input type="text" class="form-control" id="usr">
						</div>

					<div class="form-group col-sm-8">
						<p class="text-left">
                    				<a href=""""),_display_(/*73.35*/routes/*73.41*/.ShoppingCtrl.placeOrder()),format.raw/*73.67*/("""" class="btn btn-success btn-sm">
                    				<span class="glyphicon glyphicon-euro"></span> Place Order</a>
               					</p>
					</div>	

					</div>
				</div>

			</div>

			</div>








		</div>


""")))}),format.raw/*95.2*/("""
"""),format.raw/*96.1*/("""<!-- Create file payment, change routes -->


"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter) => apply(customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object payment extends payment_Scope0.payment
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 13:44:20 IST 2017
                  SOURCE: /home/wdd/Desktop/project/up-to-31-03-17/app/views/customer/payment.scala.html
                  HASH: 2e0ab8ecf52f9b9de8b579a4ed16bc2758e1567f
                  MATRIX: 825->1|1043->123|1072->127|1128->175|1168->178|1198->182|3141->2098|3156->2104|3203->2130|3458->2355|3486->2356
                  LINES: 27->1|32->1|35->4|35->4|35->4|38->7|104->73|104->73|104->73|126->95|127->96
                  -- GENERATED --
              */
          