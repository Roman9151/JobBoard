package jobboard.entitty

import jobboard.entitty.Entity
import jobboard.wrapper.UserWrapper.{UserId, UserJobPostId, UserName}

final case class User(id: UserId,
                      name: UserName,
                      userJobPostId: UserJobPostId) extends Entity
