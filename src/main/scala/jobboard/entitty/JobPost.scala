package jobboard.entitty

import jobboard.wrapper.JobPostWrapper.{JobPostId, JobPostSalary, JobPostTitle}

final case class JobPost(id: JobPostId,
                         title: JobPostTitle,
                         jobPostSalary: JobPostSalary) extends Entity

