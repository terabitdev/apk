package io.elevenlabs.data.worker;

import ae.l;
import android.content.Context;
import android.gov.nist.core.Separators;
import androidx.room.m0;
import com.google.protobuf.c6;
import defpackage.f;
import eo.k;
import fr.d0;
import ho.p;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.model.response.Alignment;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.domain.Logger;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c0;
import okhttp3.ResponseBody;
import sn.z;
import wn.c;
import wq.n;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloader$processStreamResponseToDisk$2", f = "OfflineReadsDownloader.kt", l = {397, 402}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader$processStreamResponseToDisk$2 extends i implements p {
    final /* synthetic */ long $chapterCharCount;
    final /* synthetic */ int $chapterIndex;
    final /* synthetic */ long $offlineReadId;
    final /* synthetic */ String $readId;
    final /* synthetic */ ResponseBody $responseBody;
    final /* synthetic */ long $startingCharOffset;
    final /* synthetic */ String $voiceId;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ OfflineReadsDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloader$processStreamResponseToDisk$2(OfflineReadsDownloader offlineReadsDownloader, String str, String str2, long j4, ResponseBody responseBody, int i10, long j10, long j11, c<? super OfflineReadsDownloader$processStreamResponseToDisk$2> cVar) {
        super(2, cVar);
        this.this$0 = offlineReadsDownloader;
        this.$readId = str;
        this.$voiceId = str2;
        this.$startingCharOffset = j4;
        this.$responseBody = responseBody;
        this.$chapterIndex = i10;
        this.$chapterCharCount = j10;
        this.$offlineReadId = j11;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new OfflineReadsDownloader$processStreamResponseToDisk$2(this.this$0, this.$readId, this.$voiceId, this.$startingCharOffset, this.$responseBody, this.$chapterIndex, this.$chapterCharCount, this.$offlineReadId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((OfflineReadsDownloader$processStreamResponseToDisk$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0267 A[Catch: all -> 0x0284, TRY_LEAVE, TryCatch #1 {all -> 0x0284, blocks: (B:10:0x0261, B:12:0x0267), top: B:9:0x0261 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:16:0x0121, B:18:0x0127, B:21:0x012e, B:23:0x0134, B:25:0x0146, B:27:0x018d, B:29:0x0193, B:30:0x019a, B:32:0x01ab, B:33:0x01b5), top: B:15:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:16:0x0121, B:18:0x0127, B:21:0x012e, B:23:0x0134, B:25:0x0146, B:27:0x018d, B:29:0x0193, B:30:0x019a, B:32:0x01ab, B:33:0x01b5), top: B:15:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:16:0x0121, B:18:0x0127, B:21:0x012e, B:23:0x0134, B:25:0x0146, B:27:0x018d, B:29:0x0193, B:30:0x019a, B:32:0x01ab, B:33:0x01b5), top: B:15:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0250 -> B:9:0x0261). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        Context context;
        BufferedReader bufferedReader;
        OfflineReadsDownloader offlineReadsDownloader;
        int i11;
        int i12;
        BufferedReader bufferedReader2;
        File file;
        c0 c0Var;
        long j4;
        ?? r10;
        ?? r11;
        long j10;
        BufferedReader bufferedReader3;
        Throwable th;
        ?? r14;
        OfflineReadsDownloader offlineReadsDownloader2;
        int i13;
        String str;
        xn.a aVar;
        int i14;
        c0 c0Var2;
        EnrichedAudioChunk enrichedAudioChunk;
        int i15;
        b0 b0Var;
        long j11;
        long j12;
        c0 c0Var3;
        BufferedReader bufferedReader4;
        int i16;
        int i17;
        File file2;
        OfflineReadsDao offlineReadsDao;
        xn.a aVar2;
        String readLine;
        Logger logger;
        boolean isStopped;
        vr.c cVar;
        int i18;
        OfflineReadsDao offlineReadsDao2;
        List<String> chars;
        Logger logger2;
        long j13;
        String str2;
        Logger logger3;
        int i19 = this.label;
        String str3 = "OfflineReadsDownloadWorker";
        xn.a aVar3 = xn.a.f37986a;
        if (i19 != 0) {
            if (i19 != 1) {
                if (i19 == 2) {
                    int i20 = this.I$1;
                    int i21 = this.I$0;
                    long j14 = this.J$1;
                    long j15 = this.J$0;
                    enrichedAudioChunk = (EnrichedAudioChunk) this.L$8;
                    BufferedReader bufferedReader5 = (BufferedReader) this.L$6;
                    OfflineReadsDownloader offlineReadsDownloader3 = (OfflineReadsDownloader) this.L$5;
                    ?? r82 = (Closeable) this.L$4;
                    c0 c0Var4 = (c0) this.L$3;
                    b0 b0Var2 = (b0) this.L$2;
                    c0 c0Var5 = (c0) this.L$1;
                    int i22 = i20;
                    File file3 = (File) this.L$0;
                    try {
                        sn.a.g(obj);
                        c0 c0Var6 = c0Var4;
                        c0Var = c0Var5;
                        b0 b0Var3 = b0Var2;
                        str = "OfflineReadsDownloadWorker";
                        BufferedReader bufferedReader6 = r82;
                        i13 = 1;
                        file = file3;
                        try {
                            try {
                                if (!enrichedAudioChunk.isFinal()) {
                                    logger3 = offlineReadsDownloader3.logger;
                                    StringBuilder sb = new StringBuilder();
                                    j13 = j14;
                                    sb.append("Final audio chunk received for chapter ");
                                    sb.append(i21);
                                    str2 = str;
                                    logger3.log(str2, sb.toString());
                                } else {
                                    j13 = j14;
                                    str2 = str;
                                }
                                long j16 = j15;
                                i12 = i21;
                                j4 = j16;
                                bufferedReader2 = bufferedReader5;
                                offlineReadsDownloader = offlineReadsDownloader3;
                                i11 = i22;
                                i10 = i13;
                                bufferedReader = bufferedReader6;
                                str3 = str2;
                                j10 = j13;
                                r10 = b0Var3;
                                r11 = c0Var6;
                                readLine = bufferedReader2.readLine();
                                if (readLine != null && !n.m0(readLine)) {
                                    isStopped = offlineReadsDownloader.isStopped();
                                    if (!isStopped) {
                                        logger2 = offlineReadsDownloader.logger;
                                        logger2.log(str3, "processStreamResponseToDisk - work stopped");
                                    } else {
                                        str = str3;
                                        cVar = offlineReadsDownloader.json;
                                        cVar.getClass();
                                        int i23 = i11;
                                        EnrichedAudioChunk enrichedAudioChunk2 = (EnrichedAudioChunk) cVar.b(readLine, EnrichedAudioChunk.INSTANCE.serializer());
                                        long j17 = j10;
                                        int i24 = i12;
                                        k.n0(new File(file, c0Var.f20558a + "_chunk.json"), readLine);
                                        r10.f20557a = r10.f20557a + 1;
                                        Alignment alignment = enrichedAudioChunk2.getAlignment();
                                        if (alignment != null && (chars = alignment.getChars()) != null) {
                                            i15 = chars.size();
                                        } else {
                                            i15 = 0;
                                        }
                                        long j18 = i15;
                                        c0Var.f20558a += j18;
                                        long j19 = r11.f20558a + j18;
                                        r11.f20558a = j19;
                                        if (j4 > 0) {
                                            i18 = (int) ((((float) j19) / ((float) j4)) * 100);
                                        } else {
                                            i18 = 0;
                                        }
                                        offlineReadsDao2 = offlineReadsDownloader.offlineReadsDao;
                                        OfflineChapterEntity.Status status = OfflineChapterEntity.Status.DOWNLOADING;
                                        int m10 = l.m(i18, 0, 99);
                                        this.L$0 = file;
                                        this.L$1 = c0Var;
                                        this.L$2 = r10;
                                        this.L$3 = r11;
                                        this.L$4 = bufferedReader;
                                        this.L$5 = offlineReadsDownloader;
                                        this.L$6 = bufferedReader2;
                                        this.L$7 = null;
                                        this.L$8 = enrichedAudioChunk2;
                                        this.J$0 = j4;
                                        long j20 = j4;
                                        this.J$1 = j17;
                                        i16 = i24;
                                        this.I$0 = i16;
                                        this.I$1 = i23;
                                        this.I$2 = i15;
                                        this.I$3 = i18;
                                        int i25 = i10;
                                        this.label = i25;
                                        i14 = i18;
                                        i13 = i25;
                                        if (offlineReadsDao2.updateChapterStatus(j17, i16, status, m10, this) == aVar2) {
                                            return aVar2;
                                        }
                                        aVar = aVar2;
                                        file2 = file;
                                        c0Var3 = c0Var;
                                        bufferedReader4 = bufferedReader2;
                                        offlineReadsDownloader2 = offlineReadsDownloader;
                                        r14 = bufferedReader;
                                        enrichedAudioChunk = enrichedAudioChunk2;
                                        c0Var2 = r11;
                                        j12 = j17;
                                        b0Var = r10;
                                        i17 = i23;
                                        j11 = j20;
                                        offlineReadsDao = offlineReadsDownloader2.offlineReadsDao;
                                        this.L$0 = file2;
                                        this.L$1 = c0Var3;
                                        this.L$2 = b0Var;
                                        this.L$3 = c0Var2;
                                        this.L$4 = r14;
                                        File file4 = file2;
                                        OfflineReadsDownloader offlineReadsDownloader4 = offlineReadsDownloader2;
                                        this.L$5 = offlineReadsDownloader4;
                                        this.L$6 = bufferedReader4;
                                        this.L$7 = null;
                                        this.L$8 = enrichedAudioChunk;
                                        this.J$0 = j11;
                                        this.J$1 = j12;
                                        this.I$0 = i16;
                                        this.I$1 = i17;
                                        this.I$2 = i15;
                                        this.I$3 = i14;
                                        this.label = 2;
                                        aVar3 = aVar;
                                        if (offlineReadsDao.recomputeReadAggregate(j12, this) != aVar3) {
                                            return aVar3;
                                        }
                                        i22 = i17;
                                        i21 = i16;
                                        j14 = j12;
                                        bufferedReader6 = r14;
                                        file = file4;
                                        bufferedReader5 = bufferedReader4;
                                        long j21 = j11;
                                        c0Var = c0Var3;
                                        j15 = j21;
                                        b0Var3 = b0Var;
                                        c0Var6 = c0Var2;
                                        offlineReadsDownloader3 = offlineReadsDownloader4;
                                        if (!enrichedAudioChunk.isFinal()) {
                                        }
                                        long j162 = j15;
                                        i12 = i21;
                                        j4 = j162;
                                        bufferedReader2 = bufferedReader5;
                                        offlineReadsDownloader = offlineReadsDownloader3;
                                        i11 = i22;
                                        i10 = i13;
                                        bufferedReader = bufferedReader6;
                                        str3 = str2;
                                        j10 = j13;
                                        r10 = b0Var3;
                                        r11 = c0Var6;
                                        aVar2 = aVar3;
                                        readLine = bufferedReader2.readLine();
                                        if (readLine != null) {
                                            isStopped = offlineReadsDownloader.isStopped();
                                            if (!isStopped) {
                                            }
                                        }
                                    }
                                }
                                String str4 = str3;
                                m0.o(bufferedReader, null);
                                logger = this.this$0.logger;
                                logger.log(str4, android.gov.nist.javax.sip.header.a.j(r10.f20557a, "Saved ", " chunks for chapter ", this.$chapterIndex));
                                return z.f31622a;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader3 = bufferedReader;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    m0.o(bufferedReader3, th);
                                    throw th3;
                                }
                            }
                            aVar2 = aVar3;
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader3 = bufferedReader6;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader3 = r82;
                        throw th;
                    }
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                int i26 = this.I$3;
                int i27 = this.I$2;
                i17 = this.I$1;
                i16 = this.I$0;
                long j22 = this.J$1;
                long j23 = this.J$0;
                EnrichedAudioChunk enrichedAudioChunk3 = (EnrichedAudioChunk) this.L$8;
                BufferedReader bufferedReader7 = (BufferedReader) this.L$6;
                OfflineReadsDownloader offlineReadsDownloader5 = (OfflineReadsDownloader) this.L$5;
                r14 = (Closeable) this.L$4;
                c0Var2 = (c0) this.L$3;
                b0 b0Var4 = (b0) this.L$2;
                c0 c0Var7 = (c0) this.L$1;
                file2 = (File) this.L$0;
                try {
                    sn.a.g(obj);
                    offlineReadsDownloader2 = offlineReadsDownloader5;
                    enrichedAudioChunk = enrichedAudioChunk3;
                    j11 = j23;
                    i15 = i27;
                    str = "OfflineReadsDownloadWorker";
                    j12 = j22;
                    bufferedReader4 = bufferedReader7;
                    b0Var = b0Var4;
                    c0Var3 = c0Var7;
                    i13 = 1;
                    i14 = i26;
                    aVar = aVar3;
                    r14 = r14;
                    offlineReadsDao = offlineReadsDownloader2.offlineReadsDao;
                    this.L$0 = file2;
                    this.L$1 = c0Var3;
                    this.L$2 = b0Var;
                    this.L$3 = c0Var2;
                    this.L$4 = r14;
                    File file42 = file2;
                    OfflineReadsDownloader offlineReadsDownloader42 = offlineReadsDownloader2;
                    this.L$5 = offlineReadsDownloader42;
                    this.L$6 = bufferedReader4;
                    this.L$7 = null;
                    this.L$8 = enrichedAudioChunk;
                    this.J$0 = j11;
                    this.J$1 = j12;
                    this.I$0 = i16;
                    this.I$1 = i17;
                    this.I$2 = i15;
                    this.I$3 = i14;
                    this.label = 2;
                    aVar3 = aVar;
                    if (offlineReadsDao.recomputeReadAggregate(j12, this) != aVar3) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader3 = r14;
                    throw th;
                }
            }
        } else {
            i10 = 1;
            sn.a.g(obj);
            context = this.this$0.appContext;
            File file5 = new File(context.getFilesDir(), f.k("audiodata-v1/", this.$readId, Separators.SLASH, this.$voiceId));
            if (!file5.exists()) {
                file5.mkdirs();
            }
            ?? obj2 = new Object();
            obj2.f20558a = this.$startingCharOffset;
            Object obj3 = new Object();
            Object obj4 = new Object();
            BufferedReader bufferedReader8 = new BufferedReader(new InputStreamReader(this.$responseBody.a()));
            OfflineReadsDownloader offlineReadsDownloader6 = this.this$0;
            long j24 = this.$chapterCharCount;
            long j25 = this.$offlineReadId;
            bufferedReader = bufferedReader8;
            offlineReadsDownloader = offlineReadsDownloader6;
            i11 = 0;
            i12 = this.$chapterIndex;
            bufferedReader2 = bufferedReader;
            file = file5;
            c0Var = obj2;
            j4 = j24;
            r10 = obj3;
            r11 = obj4;
            j10 = j25;
            aVar2 = aVar3;
            readLine = bufferedReader2.readLine();
            if (readLine != null) {
            }
            String str42 = str3;
            m0.o(bufferedReader, null);
            logger = this.this$0.logger;
            logger.log(str42, android.gov.nist.javax.sip.header.a.j(r10.f20557a, "Saved ", " chunks for chapter ", this.$chapterIndex));
            return z.f31622a;
        }
    }
}
