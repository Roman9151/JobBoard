package jobboard.wrapper

object JobPostWrapper {

 final case class JobPostId(id: Long)
 final case class JobPostTitle(title: String)
 final case class JobPostSalary(salary: Double)

}
