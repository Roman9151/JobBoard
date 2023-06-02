package jobboard.storeentity

import fs2.Stream
import cats.effect.IO
import jobboard.entitty.JobPost

trait StoreEntity[Entity] {

  def write(job: JobPost): IO[Unit]

  def read: Stream[IO, JobPost]

}

