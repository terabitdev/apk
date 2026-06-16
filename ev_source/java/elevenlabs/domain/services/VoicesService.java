package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H&¢\u0006\u0004\b\u000e\u0010\u0005J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u000f0\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0013\u0010\rJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0014\u0010\rJ$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0015\u0010\rJ\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0017\u0010\rJ.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/VoicesService;", "", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "", "Lio/elevenlabs/domain/model/Voice;", "voices", "", "id", "Lsn/z;", "setDefaultVoice", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "defaultVoiceId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/VoiceSection;", "getVoicesHome", "(Lwn/c;)Ljava/lang/Object;", "addVoice", "removeVoice", "getVoice", "", "isSaved", "voiceId", "readId", "", "charOffset", "getContextualPreviewUrl", "(Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VoicesService {
    Object addVoice(String str, c<? super AsyncCallResult<Voice>> cVar);

    i defaultVoiceId();

    Object getContextualPreviewUrl(String str, String str2, long j4, c<? super AsyncCallResult<String>> cVar);

    Object getVoice(String str, c<? super i> cVar);

    Object getVoicesHome(c<? super i> cVar);

    Object isSaved(String str, c<? super i> cVar);

    Object removeVoice(String str, c<? super AsyncCallResult<z>> cVar);

    Object setDefaultVoice(String str, c<? super z> cVar);

    i sync();

    i voices();
}
