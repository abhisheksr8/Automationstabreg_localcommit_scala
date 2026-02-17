package io.prophecy.pipelines.automationstabreg_localcommit_scala_pipeline.config

import pureconfig._
import pureconfig.generic.ProductHint
import io.prophecy.libs._

case class Config(
  var c_array:     List[Long] = List(10L, 20L, 100L, -10L, 0L, 20L),
  var c_int_basic: Int = -65530,
  var c_record:    C_record = C_record()
) extends ConfigBase

object C_record {

  implicit val confHint: ProductHint[C_record] =
    ProductHint[C_record](ConfigFieldMapping(CamelCase, CamelCase))

}

case class C_record(
  var c_string:  String = "this is my123string sama",
  var c_boolean: Boolean = false,
  var c_float:   Float = -23.34f
)
