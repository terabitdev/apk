package io.elevenlabs.domain.usecase;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦B¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/usecase/DownloadReadUseCase;", "", "", "readId", "", "readTotalCharCount", "Lsn/z;", "invoke", "(Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "", "chapterIndex", "invokeForChapter", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "offlineReadId", "invokeRetry", "(JLwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface DownloadReadUseCase {
    Object invoke(String str, long j4, c<? super z> cVar);

    Object invokeForChapter(String str, int i10, c<? super String> cVar);

    Object invokeRetry(long j4, c<? super z> cVar);
}
