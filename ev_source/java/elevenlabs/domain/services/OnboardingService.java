package io.elevenlabs.domain.services;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Intro;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.Voice;
import ir.i;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u0005J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH¦@¢\u0006\u0004\b\u0010\u0010\u0005J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH¦@¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0003H&¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/OnboardingService;", "", "Lir/i;", "", "hasCompletedOnboarding", "(Lwn/c;)Ljava/lang/Object;", "hasCompletedAgeOnboarding", "Lsn/z;", "complete", "completeAgeOnboarding", SDPKeywords.CLEAR, "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "Lio/elevenlabs/domain/model/Voice;", "getSuggestedVoices", "Lio/elevenlabs/domain/model/OnboardingSurvey;", "getOnboarding", "survey", "sendOnboarding", "(Lio/elevenlabs/domain/model/OnboardingSurvey;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/Intro;", "getIntro", "shouldShowPaywall", "()Lir/i;", "hasUserSeenPaywall", "()Z", "seenPaywall", "()V", "recordAppSession", "isWinBackCooldownActive", "seenWinBackPaywall", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface OnboardingService {
    Object clear(c<? super z> cVar);

    Object complete(c<? super z> cVar);

    Object completeAgeOnboarding(c<? super z> cVar);

    Object getIntro(c<? super AsyncCallResult<Intro>> cVar);

    Object getOnboarding(c<? super AsyncCallResult<OnboardingSurvey>> cVar);

    Object getSuggestedVoices(c<? super AsyncCallResult<List<Voice>>> cVar);

    Object hasCompletedAgeOnboarding(c<? super i> cVar);

    Object hasCompletedOnboarding(c<? super i> cVar);

    boolean hasUserSeenPaywall();

    boolean isWinBackCooldownActive();

    void recordAppSession();

    void seenPaywall();

    void seenWinBackPaywall();

    Object sendOnboarding(OnboardingSurvey onboardingSurvey, c<? super AsyncCallResult<z>> cVar);

    i shouldShowPaywall();
}
