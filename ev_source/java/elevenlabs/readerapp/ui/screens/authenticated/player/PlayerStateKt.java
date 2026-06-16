package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.EffectivePlaybackMode;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"effectivePlaybackMode", "Lio/elevenlabs/domain/model/EffectivePlaybackMode;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;", "calculateCurrentChapterIndex", "", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerStateKt {
    public static final int calculateCurrentChapterIndex(ContentState contentState) {
        contentState.getClass();
        List<Chapter> chapters = contentState.getReadMeta().getChapters();
        PlaybackPosition position = contentState.getPosition();
        if (position instanceof PlaybackPosition.Tts) {
            return ChapterUtilsKt.findTtsChapterIndex(chapters, ((PlaybackPosition.Tts) position).getOffset());
        }
        if (position instanceof PlaybackPosition.AudioOnly) {
            Chapter currentChapter = contentState.getCurrentChapter();
            if (currentChapter != null) {
                return ChapterUtilsKt.findAudioChapterIndex(chapters, currentChapter.getAudioFileNumber());
            }
            return ChapterUtilsKt.findAudioChapterIndex(chapters, contentState.getReadMeta().getLastListenedAudioFileNumber());
        }
        c6.p();
        return 0;
    }

    public static final EffectivePlaybackMode effectivePlaybackMode(ContentState contentState) {
        contentState.getClass();
        return EffectivePlaybackModeKt.effectivePlaybackMode(contentState.getReadMeta(), contentState.getUsedVoiceId());
    }
}
