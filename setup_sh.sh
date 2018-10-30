#!/usr/bin/env bash
# Downloads GradleRIO, edits the build file and runs gradlew
# Simply run this in the directory that the src folder is in, then open in idea
# NOTE this will remove all intellij project files and such in the folder
ORANGE='\033[0;33m'
NC='\033[0m'

echo -e "${ORANGE}Removing old project files${NC}"
rm -rf GradleRIO *.iml *.ipr build.gradle build gradle* .idea java cpp Quickstart.zip .gradle
git clone https://github.com/wpilibsuite/GradleRIO.git
mv GradleRIO/Quickstart.zip .
rm -rf GradleRIO
unzip Quickstart.zip
echo -e "${ORANGE}Moving gradle to current directory${NC}"
mv java/* .
chmod +x gradlew
echo -e "${ORANGE}Cleaning up${NC}"
rm -rf cpp Quickstart.zip java
echo -e "${ORANGE}Modifying build.gradle${NC}"
sed -i 's/def TEAM = 5333/def TEAM = 852/g' build.gradle # Find and Replace
sed -i 's/frc.team0000/frc.team852/g' build.gradle
sed -i '/openrio.powerup/d' build.gradle # Find and Delete
echo -e "${ORANGE}Running gradlew${NC}"
./gradlew
