package io.elevenlabs.domain.services;

import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00160\u0015H&¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eH¦@¢\u0006\u0004\b\"\u0010\u001e¨\u0006#À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/OfflineReadsService;", "", "", "readId", "voiceId", "", "totalCharCount", "Lio/elevenlabs/domain/services/DownloadReadResult;", "downloadAllChapters", "(Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "", "chapterIndex", "downloadChapter", "(Ljava/lang/String;Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "Lsn/z;", "removeChapterDownload", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "offlineReadId", "removeDownload", "(JLwn/c;)Ljava/lang/Object;", "retryDownload", "Lir/i;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getDownloadedReads", "()Lir/i;", "Lio/elevenlabs/domain/model/OfflineReadData;", "getAllOfflineReads", "", "hasDownloadedReads", "(Lwn/c;)Ljava/lang/Object;", "removeAllDownloadedReads", "removeDownloadsForRead", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "cleanupExpiredDownloads", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface OfflineReadsService {
    Object cleanupExpiredDownloads(c<? super z> cVar);

    Object downloadAllChapters(String str, String str2, long j4, c<? super DownloadReadResult> cVar);

    Object downloadChapter(String str, String str2, int i10, c<? super DownloadReadResult> cVar);

    i getAllOfflineReads();

    i getDownloadedReads();

    Object hasDownloadedReads(c<? super Boolean> cVar);

    Object removeAllDownloadedReads(c<? super z> cVar);

    Object removeChapterDownload(String str, int i10, c<? super z> cVar);

    Object removeDownload(long j4, c<? super z> cVar);

    Object removeDownloadsForRead(String str, c<? super z> cVar);

    Object retryDownload(long j4, c<? super DownloadReadResult> cVar);
}
