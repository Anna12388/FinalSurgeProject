package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder

public class WorkoutQuickAdd {
        String date;
        String time;
        String activityType;
        String workoutName;
        String workoutDescription;
        boolean showPlannedDistance;
        String plannedDistance;
        String plannedDistanceType;
        String plannedDuration;
        String distance;
        String distanceType;
        String duration;
        String pace;
        String paceType;
        String howIFelt;
        String perceivedEffort;
        String postNotes;
        boolean saveToLibrary;

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }

        public String getTime() {
                return time;
        }

        public void setTime(String time) {
                this.time = time;
        }

        public String getActivityType() {
                return activityType;
        }

        public void setActivityType(String activityType) {
                this.activityType = activityType;
        }

        public String getWorkoutName() {
                return workoutName;
        }

        public void setWorkoutName(String workoutName) {
                this.workoutName = workoutName;
        }

        public String getWorkoutDescription() {
                return workoutDescription;
        }

        public void setWorkoutDescription(String workoutDescription) {
                this.workoutDescription = workoutDescription;
        }

        public boolean isShowPlannedDistance() {
                return showPlannedDistance;
        }

        public void setShowPlannedDistance(boolean showPlannedDistance) {
                this.showPlannedDistance = showPlannedDistance;
        }

        public String getPlannedDistance() {
                return plannedDistance;
        }

        public void setPlannedDistance(String plannedDistance) {
                this.plannedDistance = plannedDistance;
        }

        public String getPlannedDistanceType() {
                return plannedDistanceType;
        }

        public void setPlannedDistanceType(String plannedDistanceType) {
                this.plannedDistanceType = plannedDistanceType;
        }

        public String getPlannedDuration() {
                return plannedDuration;
        }

        public void setPlannedDuration(String plannedDuration) {
                this.plannedDuration = plannedDuration;
        }

        public String getDistance() {
                return distance;
        }

        public void setDistance(String distance) {
                this.distance = distance;
        }

        public String getDistanceType() {
                return distanceType;
        }

        public void setDistanceType(String distanceType) {
                this.distanceType = distanceType;
        }

        public String getDuration() {
                return duration;
        }

        public void setDuration(String duration) {
                this.duration = duration;
        }

        public String getPace() {
                return pace;
        }

        public void setPace(String pace) {
                this.pace = pace;
        }

        public String getPaceType() {
                return paceType;
        }

        public void setPaceType(String paceType) {
                this.paceType = paceType;
        }

        public String getHowIFelt() {
                return howIFelt;
        }

        public void setHowIFelt(String howIFelt) {
                this.howIFelt = howIFelt;
        }

        public String getPerceivedEffort() {
                return perceivedEffort;
        }

        public void setPerceivedEffort(String perceivedEffort) {
                this.perceivedEffort = perceivedEffort;
        }

        public String getPostNotes() {
                return postNotes;
        }

        public void setPostNotes(String postNotes) {
                this.postNotes = postNotes;
        }

        public boolean isSaveToLibrary() {
                return saveToLibrary;
        }

        public void setSaveToLibrary(boolean saveToLibrary) {
                this.saveToLibrary = saveToLibrary;
        }
}
