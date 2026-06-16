package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import hr.w;
import hr.x;
import io.elevenlabs.data.model.response.Alignment;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.data.services.OfflineChunkFlowFactory;
import io.elevenlabs.domain.Logger;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OfflineChunkFlowFactory$createChunkFlow$1", f = "ReadsStreamingService.kt", l = {546, 559, 570}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineChunkFlowFactory$createChunkFlow$1 extends yn.i implements p {
    final /* synthetic */ String $readId;
    final /* synthetic */ long $startingPosition;
    final /* synthetic */ String $uri;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ OfflineChunkFlowFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineChunkFlowFactory$createChunkFlow$1(OfflineChunkFlowFactory offlineChunkFlowFactory, String str, long j4, String str2, wn.c<? super OfflineChunkFlowFactory$createChunkFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = offlineChunkFlowFactory;
        this.$readId = str;
        this.$startingPosition = j4;
        this.$uri = str2;
    }

    public static final String invokeSuspend$lambda$0(ChunkWithAlignmentPosition chunkWithAlignmentPosition) {
        List<String> list;
        int chunkIndex = chunkWithAlignmentPosition.getChunkIndex();
        long alignmentPosition = chunkWithAlignmentPosition.getAlignmentPosition();
        Alignment alignment = chunkWithAlignmentPosition.getChunk().getAlignment();
        if (alignment != null) {
            list = alignment.getChars();
        } else {
            list = null;
        }
        return "Chunk: " + chunkIndex + ": " + alignmentPosition + ": " + list;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        OfflineChunkFlowFactory$createChunkFlow$1 offlineChunkFlowFactory$createChunkFlow$1 = new OfflineChunkFlowFactory$createChunkFlow$1(this.this$0, this.$readId, this.$startingPosition, this.$uri, cVar);
        offlineChunkFlowFactory$createChunkFlow$1.L$0 = obj;
        return offlineChunkFlowFactory$createChunkFlow$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((OfflineChunkFlowFactory$createChunkFlow$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x021e, code lost:
    
        if (fr.g0.T(r24) == r10) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0176 A[Catch: Exception -> 0x003f, CancellationException -> 0x0042, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0042, Exception -> 0x003f, blocks: (B:8:0x0036, B:11:0x0170, B:13:0x0176, B:16:0x017e, B:19:0x01a8, B:24:0x01e7, B:26:0x01f1, B:28:0x0203, B:34:0x0066, B:37:0x0081, B:38:0x016b, B:40:0x00b2, B:43:0x00be, B:45:0x00da, B:48:0x0132, B:50:0x013e, B:51:0x014e, B:54:0x014a), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f1 A[Catch: Exception -> 0x003f, CancellationException -> 0x0042, TryCatch #2 {CancellationException -> 0x0042, Exception -> 0x003f, blocks: (B:8:0x0036, B:11:0x0170, B:13:0x0176, B:16:0x017e, B:19:0x01a8, B:24:0x01e7, B:26:0x01f1, B:28:0x0203, B:34:0x0066, B:37:0x0081, B:38:0x016b, B:40:0x00b2, B:43:0x00be, B:45:0x00da, B:48:0x0132, B:50:0x013e, B:51:0x014e, B:54:0x014a), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0203 A[Catch: Exception -> 0x003f, CancellationException -> 0x0042, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0042, Exception -> 0x003f, blocks: (B:8:0x0036, B:11:0x0170, B:13:0x0176, B:16:0x017e, B:19:0x01a8, B:24:0x01e7, B:26:0x01f1, B:28:0x0203, B:34:0x0066, B:37:0x0081, B:38:0x016b, B:40:0x00b2, B:43:0x00be, B:45:0x00da, B:48:0x0132, B:50:0x013e, B:51:0x014e, B:54:0x014a), top: B:2:0x0014 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x021e -> B:10:0x0221). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        Logger logger2;
        String str2;
        Logger logger3;
        String str3;
        OfflineChunkFlowFactory.OfflineUriParts parseOfflineReadUri;
        Logger logger4;
        String str4;
        Context context;
        vr.c cVar;
        Logger logger5;
        DiskChunkReader diskChunkReader;
        long j4;
        ChunkWithAlignmentPosition chunkByAlignmentPosition;
        long alignmentPosition;
        EnrichedAudioChunk chunk;
        Logger logger6;
        String str5;
        int chunkIndex;
        boolean z6;
        DiskChunkReader diskChunkReader2;
        ChunkWithAlignmentPosition chunkWithAlignmentPosition;
        Logger logger7;
        String str6;
        Logger logger8;
        String str7;
        Logger logger9;
        String str8;
        x xVar = (x) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        boolean z10 = true;
        xn.a aVar = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            chunkIndex = this.I$0;
                            alignmentPosition = this.J$1;
                            j4 = this.J$0;
                            DiskChunkReader diskChunkReader3 = (DiskChunkReader) this.L$2;
                            sn.a.g(obj);
                            diskChunkReader2 = diskChunkReader3;
                            z6 = true;
                            diskChunkReader = diskChunkReader2;
                            z10 = z6;
                            if (g0.y(xVar)) {
                                ChunkWithAlignmentPosition chunkByIndex = diskChunkReader.getChunkByIndex(chunkIndex);
                                OfflineChunkFlowFactory offlineChunkFlowFactory = this.this$0;
                                if (chunkByIndex == null) {
                                    logger9 = offlineChunkFlowFactory.logger;
                                    str8 = this.this$0.tag;
                                    Logger.logWarning$default(logger9, str8, "Chunk with index=" + chunkIndex + " not found", null, 4, null);
                                    return zVar;
                                }
                                logger8 = offlineChunkFlowFactory.logger;
                                str7 = this.this$0.tag;
                                z6 = z10;
                                logger8.verbose(str7, new f(chunkByIndex, 0));
                                EnrichedAudioChunk chunk2 = chunkByIndex.getChunk();
                                this.L$0 = xVar;
                                this.L$1 = null;
                                this.L$2 = diskChunkReader;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = chunkByIndex;
                                this.J$0 = j4;
                                this.J$1 = alignmentPosition;
                                this.I$0 = chunkIndex;
                                this.label = 2;
                                if (((w) xVar).f12593d.c(chunk2, this) != aVar) {
                                    diskChunkReader2 = diskChunkReader;
                                    chunkWithAlignmentPosition = chunkByIndex;
                                    if (!chunkWithAlignmentPosition.getChunk().isFinal()) {
                                        logger7 = this.this$0.logger;
                                        str6 = this.this$0.tag;
                                        logger7.log(str6, "Final chunk emitted");
                                        return zVar;
                                    }
                                    chunkIndex++;
                                    this.L$0 = xVar;
                                    this.L$1 = null;
                                    this.L$2 = diskChunkReader2;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.J$0 = j4;
                                    this.J$1 = alignmentPosition;
                                    this.I$0 = chunkIndex;
                                    this.label = 3;
                                } else {
                                    return aVar;
                                }
                            }
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    chunkIndex = this.I$0;
                    alignmentPosition = this.J$1;
                    j4 = this.J$0;
                    chunkWithAlignmentPosition = (ChunkWithAlignmentPosition) this.L$5;
                    diskChunkReader2 = (DiskChunkReader) this.L$2;
                    sn.a.g(obj);
                    z6 = true;
                    if (!chunkWithAlignmentPosition.getChunk().isFinal()) {
                    }
                } else {
                    alignmentPosition = this.J$1;
                    j4 = this.J$0;
                    chunkByAlignmentPosition = (ChunkWithAlignmentPosition) this.L$3;
                    diskChunkReader = (DiskChunkReader) this.L$2;
                    sn.a.g(obj);
                }
            } else {
                sn.a.g(obj);
                logger3 = this.this$0.logger;
                str3 = this.this$0.tag;
                String str9 = this.$readId;
                long j10 = this.$startingPosition;
                String str10 = this.$uri;
                StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("Creating offline chunk flow for readId: ", str9, j10, ", startingPosition: ");
                r10.append(", uri: ");
                r10.append(str10);
                logger3.log(str3, r10.toString());
                parseOfflineReadUri = this.this$0.parseOfflineReadUri(this.$uri);
                OfflineChunkFlowFactory offlineChunkFlowFactory2 = this.this$0;
                if (parseOfflineReadUri == null) {
                    logger6 = offlineChunkFlowFactory2.logger;
                    str5 = this.this$0.tag;
                    logger6.logError(str5, "Invalid offline read URI format: " + this.$uri, null);
                    return zVar;
                }
                logger4 = offlineChunkFlowFactory2.logger;
                str4 = this.this$0.tag;
                logger4.log(str4, "Parsed URI - audioDataVersion: " + parseOfflineReadUri.getAudioDataVersion() + ", voiceId: " + parseOfflineReadUri.getVoiceId());
                context = this.this$0.appContext;
                cVar = this.this$0.json;
                logger5 = this.this$0.logger;
                diskChunkReader = new DiskChunkReader(context, cVar, logger5, parseOfflineReadUri.getUriReadId(), parseOfflineReadUri.getVoiceId(), parseOfflineReadUri.getAudioDataVersion());
                j4 = this.$startingPosition;
                chunkByAlignmentPosition = diskChunkReader.getChunkByAlignmentPosition(j4);
                if (chunkByAlignmentPosition != null) {
                    alignmentPosition = j4 - chunkByAlignmentPosition.getAlignmentPosition();
                    if (alignmentPosition > 0) {
                        chunk = this.this$0.sliceChunk(chunkByAlignmentPosition.getChunk(), (int) alignmentPosition);
                    } else {
                        chunk = chunkByAlignmentPosition.getChunk();
                    }
                    this.L$0 = xVar;
                    this.L$1 = null;
                    this.L$2 = diskChunkReader;
                    this.L$3 = chunkByAlignmentPosition;
                    this.L$4 = null;
                    this.J$0 = j4;
                    this.J$1 = alignmentPosition;
                    this.label = 1;
                    if (((w) xVar).f12593d.c(chunk, this) == aVar) {
                        return aVar;
                    }
                } else {
                    return zVar;
                }
            }
            chunkIndex = chunkByAlignmentPosition.getChunkIndex() + 1;
            if (g0.y(xVar)) {
            }
            return zVar;
        } catch (CancellationException e10) {
            logger2 = this.this$0.logger;
            str2 = this.this$0.tag;
            logger2.log(str2, "Flow cancelled; likely isLoadingAllowed turned false (" + e10.getClass().getSimpleName() + Separators.RPAREN);
            return zVar;
        } catch (Exception e11) {
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.logError(str, "Error creating offline chunk flow", e11);
            throw new IOException("Failed to create offline chunk flow", e11);
        }
    }
}
