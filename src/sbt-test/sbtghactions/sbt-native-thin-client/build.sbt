ThisBuild / githubWorkflowBuild ++= List(
  WorkflowStep.Sbt(List("lots")),
  WorkflowStep.Sbt(List("of")),
  WorkflowStep.Sbt(List("sbt")),
  WorkflowStep.Sbt(List("tasks")),
  WorkflowStep.Sbt(List("run")),
  WorkflowStep.Sbt(List("as")),
  WorkflowStep.Sbt(List("separate")),
  WorkflowStep.Sbt(List("steps")),
  WorkflowStep.Sbt(List("using")),
  WorkflowStep.Sbt(List("sbtn"))
)
