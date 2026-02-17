package io.prophecy.pipelines.automationstabreg_localcommit_scala_pipeline.graph

import io.prophecy.libs._
import io.prophecy.pipelines.automationstabreg_localcommit_scala_pipeline.functions.PipelineInitCode._
import io.prophecy.pipelines.automationstabreg_localcommit_scala_pipeline.functions.UDFs._
import io.prophecy.pipelines.automationstabreg_localcommit_scala_pipeline.config.Context
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.expressions._
import java.time._

object concat_config_fields {

  def apply(context: Context, in: DataFrame): DataFrame = {
    val Config = context.config
    in.select(
      concat(lit(Config.c_int_basic),
             lit(Config.c_record.c_string),
             lit(Config.c_array(0))
      ).as("c_config_col")
    )
  }

}
