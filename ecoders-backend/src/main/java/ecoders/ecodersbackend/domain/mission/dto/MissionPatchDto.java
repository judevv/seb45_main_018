package ecoders.ecodersbackend.domain.mission.dto;

import ecoders.ecodersbackend.domain.mission.entity.Mission;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

public class MissionPatchDto {

    @Getter
    public static class Request {

        private long missionId;

        private String text;

        private Mission.MissionProgress missionProgress;
    }

    @Getter
    @AllArgsConstructor
    public static class Response {

        private final Long id;
        private final String text;
        private final Timestamp createdAt;
        private final Timestamp modifiedAt;
        private final Long memberId;
    }
}
