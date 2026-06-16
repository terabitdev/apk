package io.elevenlabs.domain.usecase;

import a9.a;
import android.gov.nist.javax.sip.header.ParameterNames;
import ho.l;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JF\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH¦B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/usecase/PlayPronunciationPreviewUseCase;", "", "", ParameterNames.TEXT, "voiceId", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "currentState", "Lkotlin/Function1;", "Lsn/z;", "onStateUpdate", "", "forcePlay", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lho/l;ZLwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PlayPronunciationPreviewUseCase {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object invoke$default(PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase, String str, String str2, PronunciationPreviewState pronunciationPreviewState, l lVar, boolean z6, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 16) != 0) {
                z6 = false;
            }
            return playPronunciationPreviewUseCase.invoke(str, str2, pronunciationPreviewState, lVar, z6, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: invoke");
        return null;
    }

    Object invoke(String str, String str2, PronunciationPreviewState pronunciationPreviewState, l lVar, boolean z6, c<? super z> cVar);
}
