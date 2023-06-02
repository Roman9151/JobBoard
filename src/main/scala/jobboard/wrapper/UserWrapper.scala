package jobboard.wrapper

object UserWrapper {

  final case class UserId(id: Long)

  final case class UserName(name: String)

  final case class UserJobPostId(userJobPostId: Long)

}
