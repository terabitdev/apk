package io.elevenlabs.data.services;

import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanEntity;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.request.ConsumptionSpanRequest;
import io.elevenlabs.domain.model.ConsumptionSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0003H\u0002\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"MAX_SPANS_PER_REQUEST", "", "toEntity", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "Lio/elevenlabs/domain/model/ConsumptionSpan;", "toApiModel", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;", "toApiPlaybackSource", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;", "", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConsumptionRepositoryKt {
    private static final int MAX_SPANS_PER_REQUEST = 50;

    public static final ConsumptionSpanRequest toApiModel(ConsumptionSpanEntity consumptionSpanEntity) {
        ConsumptionSpanRequest.PlaybackSource playbackSource;
        String id2 = consumptionSpanEntity.getId();
        String audio_file_number = consumptionSpanEntity.getAudio_file_number();
        if (audio_file_number == null) {
            audio_file_number = "000";
        }
        double start_seconds = consumptionSpanEntity.getStart_seconds();
        double end_seconds = consumptionSpanEntity.getEnd_seconds();
        Long start_char_offset = consumptionSpanEntity.getStart_char_offset();
        Long end_char_offset = consumptionSpanEntity.getEnd_char_offset();
        Long valueOf = Long.valueOf(consumptionSpanEntity.getListened_at_unix());
        Float valueOf2 = Float.valueOf(consumptionSpanEntity.getPlayback_speed());
        Double valueOf3 = Double.valueOf(consumptionSpanEntity.getReal_time_duration_seconds());
        ConsumptionSpanRequest.Type requestType = ReadMappingKt.toRequestType(consumptionSpanEntity.getType());
        String playback_source = consumptionSpanEntity.getPlayback_source();
        if (playback_source != null) {
            playbackSource = toApiPlaybackSource(playback_source);
        } else {
            playbackSource = null;
        }
        return new ConsumptionSpanRequest(id2, audio_file_number, start_seconds, end_seconds, start_char_offset, end_char_offset, valueOf, valueOf2, valueOf3, requestType, playbackSource, consumptionSpanEntity.getDevice_online(), consumptionSpanEntity.getVoice_id());
    }

    private static final ConsumptionSpanRequest.PlaybackSource toApiPlaybackSource(String str) {
        if (m.c(str, "ONLINE")) {
            return ConsumptionSpanRequest.PlaybackSource.ONLINE;
        }
        if (m.c(str, "OFFLINE")) {
            return ConsumptionSpanRequest.PlaybackSource.OFFLINE;
        }
        return null;
    }

    public static final ConsumptionSpanEntity toEntity(ConsumptionSpan consumptionSpan) {
        return new ConsumptionSpanEntity(consumptionSpan.getId(), consumptionSpan.getReadId(), consumptionSpan.getAudioFileNumber(), consumptionSpan.getStartSeconds(), consumptionSpan.getEndSeconds(), consumptionSpan.getStartCharOffset(), consumptionSpan.getEndCharOffset(), consumptionSpan.getListenedAtUnix(), consumptionSpan.getPlaybackSpeed(), consumptionSpan.getRealTimeDurationSeconds(), consumptionSpan.getType(), consumptionSpan.getPlaybackSource().name(), Boolean.valueOf(consumptionSpan.getDeviceOnline()), consumptionSpan.getVoiceId());
    }
}
