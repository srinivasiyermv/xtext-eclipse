if [ -z "$JENKINS_URL" ]; then
  # if not set in environment use default
  JENKINS_URL=https://ci.eclipse.org/xtext/
fi

if [ -z "$TARGET_PLATFORM" ]; then
  TARGET_PLATFORM=oxygen
fi

mvn \
  --batch-mode \
  --update-snapshots \
  -fae \
  -Dmaven.test.failure.ignore=true \
  -Dmaven.repo.local=.m2/repository \
  -DJENKINS_URL=$JENKINS_URL \
  -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn \
  -P$TARGET_PLATFORM \
  install