package esimport;

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom

@js.native @JSImport("jquery", JSImport.Default)
val jq: js.Any = js.native

@js.native @JSImport("jquery", JSImport.Namespace)
val jq2: js.Any = js.native

@main
def Main(): Unit =
  dom.document.querySelector("#app").innerHTML = s"""
  import default: ${jq.toString()}<br>
  import namespace: ${jq2.toString()}

  """


