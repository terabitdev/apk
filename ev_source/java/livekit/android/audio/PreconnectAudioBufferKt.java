package io.livekit.android.audio;

import android.gov.nist.javax.sip.parser.TokenNames;
import fr.g0;
import ho.l;
import io.livekit.android.room.Room;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001ak\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\n\u001a\u0014\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {TokenNames.T, "Lio/livekit/android/room/Room;", "Lxq/b;", "timeout", "", "topic", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lsn/z;", "onError", "Lwn/c;", "", "operation", "withPreconnectAudio-NcHsxvU", "(Lio/livekit/android/room/Room;JLjava/lang/String;Lho/l;Lho/l;Lwn/c;)Ljava/lang/Object;", "withPreconnectAudio", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PreconnectAudioBufferKt {
    /* renamed from: withPreconnectAudio-NcHsxvU, reason: not valid java name */
    public static final <T> Object m2516withPreconnectAudioNcHsxvU(Room room, long j4, String str, l lVar, l lVar2, wn.c<? super T> cVar) {
        return g0.l(new PreconnectAudioBufferKt$withPreconnectAudio$2(room, j4, lVar2, str, lVar, null), cVar);
    }

    /* renamed from: withPreconnectAudio-NcHsxvU$default, reason: not valid java name */
    public static /* synthetic */ Object m2517withPreconnectAudioNcHsxvU$default(Room room, long j4, String str, l lVar, l lVar2, wn.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = PreconnectAudioBuffer.INSTANCE.m2515getTIMEOUTUwyO8pc();
        }
        long j10 = j4;
        if ((i10 & 2) != 0) {
            str = PreconnectAudioBuffer.DEFAULT_TOPIC;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        return m2516withPreconnectAudioNcHsxvU(room, j10, str2, lVar, lVar2, cVar);
    }
}
