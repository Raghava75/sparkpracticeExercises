package demo.sampleLearning.sparkExamples

import org.apache.spark.sql.SparkSession

object HelloSpark extends  Serializable {
  def main(args: Array[String]): Unit ={
    val spark = SparkSession.builder()
      .getOrCreate()

  }

}
