package io.elevenlabs.domain.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Pronunciation;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0004\b\r\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0016\u0010\u000b¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/PronunciationsService;", "", "Lsn/z;", "refreshPronunciations", "(Lwn/c;)Ljava/lang/Object;", "", "originalText", "spokenText", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/Pronunciation;", "createPronunciation", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "id", "updatePronunciation", "deletePronunciation", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lir/i;", "", "observePronunciations", "()Lir/i;", ParameterNames.TEXT, "voiceId", "generatePreviewUrl", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PronunciationsService {
    Object createPronunciation(String str, String str2, c<? super AsyncCallResult<Pronunciation>> cVar);

    Object deletePronunciation(String str, c<? super AsyncCallResult<z>> cVar);

    Object generatePreviewUrl(String str, String str2, c<? super AsyncCallResult<String>> cVar);

    i observePronunciations();

    Object refreshPronunciations(c<? super z> cVar);

    Object updatePronunciation(String str, String str2, c<? super AsyncCallResult<Pronunciation>> cVar);
}
