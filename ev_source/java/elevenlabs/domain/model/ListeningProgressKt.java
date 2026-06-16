package io.elevenlabs.domain.model;

import ae.l;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"listeningProgress", "Lio/elevenlabs/domain/model/ListeningProgress;", "Lio/elevenlabs/domain/model/ReadMeta;", "getListeningProgress", "(Lio/elevenlabs/domain/model/ReadMeta;)Lio/elevenlabs/domain/model/ListeningProgress;", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ListeningProgressKt {
    public static final ListeningProgress getListeningProgress(ReadMeta readMeta) {
        double d10;
        double d11;
        readMeta.getClass();
        int i10 = 0;
        if (ReadMetaKt.isMediaType(readMeta)) {
            Double totalAudioDurationSeconds = ReadMetaExtensionsKt.getTotalAudioDurationSeconds(readMeta);
            if (totalAudioDurationSeconds != null) {
                d10 = totalAudioDurationSeconds.doubleValue();
            } else {
                d10 = 0.0d;
            }
            Double audioElapsedSeconds = ReadMetaExtensionsKt.getAudioElapsedSeconds(readMeta);
            if (audioElapsedSeconds != null) {
                d11 = audioElapsedSeconds.doubleValue();
            } else {
                d11 = 0.0d;
            }
            if (d10 > 0.0d) {
                i10 = l.m((int) ((d11 / d10) * 100), 0, 100);
            }
            return new ListeningProgress(d11, d10, i10, ReadMetaKt.isAtEnd(readMeta), true);
        }
        if (readMeta.getCharCount() > 0) {
            i10 = l.m((int) (((readMeta.getLastListenedCharOffset() + 1) * 100.0d) / (readMeta.getCharCount() + 1)), 0, 100);
        }
        return new ListeningProgress(readMeta.getLastListenedCharOffset(), readMeta.getCharCount(), i10, ReadMetaKt.isAtEnd(readMeta), false);
    }
}
