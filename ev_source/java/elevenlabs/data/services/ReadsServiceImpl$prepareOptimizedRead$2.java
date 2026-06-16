package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import io.elevenlabs.domain.model.FileDownloadState;
import io.elevenlabs.domain.model.OptimizedReadPreparation;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$prepareOptimizedRead$2", f = "ReadsServiceImpl.kt", l = {334, 336, 339, 339}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/OptimizedReadPreparation;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$prepareOptimizedRead$2 extends yn.i implements p {
    final /* synthetic */ String $readId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$prepareOptimizedRead$2(ReadsServiceImpl readsServiceImpl, String str, wn.c<? super ReadsServiceImpl$prepareOptimizedRead$2> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsServiceImpl$prepareOptimizedRead$2 readsServiceImpl$prepareOptimizedRead$2 = new ReadsServiceImpl$prepareOptimizedRead$2(this.this$0, this.$readId, cVar);
        readsServiceImpl$prepareOptimizedRead$2.L$0 = obj;
        return readsServiceImpl$prepareOptimizedRead$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ReadsServiceImpl$prepareOptimizedRead$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r10 == r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (r10 == r8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[RETURN] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsDao readsDao;
        String str;
        OptimizedReadCache optimizedReadCache;
        ReadMetaEntity meta;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar, this.this$0, this.$readId);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (((ir.i) obj).collect(anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                    return zVar;
                }
                sn.a.g(obj);
                return zVar;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsDao = this.this$0.readsDao;
            String str2 = this.$readId;
            this.L$0 = jVar;
            this.label = 1;
            obj = readsDao.getById(str2, this);
        }
        ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
        if (readMetaEntityWithChapters != null && (meta = readMetaEntityWithChapters.getMeta()) != null) {
            str = meta.getHtml_checksum();
        } else {
            str = null;
        }
        if (str != null) {
            optimizedReadCache = this.this$0.optimizedReadCache;
            if (optimizedReadCache.readIndex(this.$readId, str) != null) {
                OptimizedReadPreparation.Ready ready = OptimizedReadPreparation.Ready.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (jVar.emit(ready, this) != aVar) {
                    return zVar;
                }
            }
        }
        ReadsServiceImpl readsServiceImpl = this.this$0;
        String str3 = this.$readId;
        this.L$0 = jVar;
        this.L$1 = null;
        this.label = 3;
        obj = readsServiceImpl.getReadHtml(str3, this);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$prepareOptimizedRead$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ ir.j $$this$flow;
        final /* synthetic */ String $readId;
        final /* synthetic */ ReadsServiceImpl this$0;

        public AnonymousClass1(ir.j jVar, ReadsServiceImpl readsServiceImpl, String str) {
            this.$$this$flow = jVar;
            this.this$0 = readsServiceImpl;
            this.$readId = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
        
            if (r9 == r7) goto L32;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(FileDownloadState fileDownloadState, wn.c<? super z> cVar) {
            ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1 readsServiceImpl$prepareOptimizedRead$2$1$emit$1;
            int i10;
            Object splitAndCacheIfNeeded;
            if (cVar instanceof ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1) {
                readsServiceImpl$prepareOptimizedRead$2$1$emit$1 = (ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1) cVar;
                int i11 = readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = readsServiceImpl$prepareOptimizedRead$2$1$emit$1.result;
                    i10 = readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label;
                    z zVar = z.f31622a;
                    xn.a aVar = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    sn.a.g(obj);
                                    return zVar;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            sn.a.g(obj);
                            ir.j jVar = this.$$this$flow;
                            OptimizedReadPreparation.Ready ready = OptimizedReadPreparation.Ready.INSTANCE;
                            readsServiceImpl$prepareOptimizedRead$2$1$emit$1.L$0 = null;
                            readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label = 3;
                            if (jVar.emit(ready, readsServiceImpl$prepareOptimizedRead$2$1$emit$1) == aVar) {
                                return aVar;
                            }
                            return zVar;
                        }
                        sn.a.g(obj);
                        return zVar;
                    }
                    sn.a.g(obj);
                    if (fileDownloadState instanceof FileDownloadState.Downloading) {
                        ir.j jVar2 = this.$$this$flow;
                        OptimizedReadPreparation.Downloading downloading = new OptimizedReadPreparation.Downloading(((FileDownloadState.Downloading) fileDownloadState).getProgress());
                        readsServiceImpl$prepareOptimizedRead$2$1$emit$1.L$0 = null;
                        readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label = 1;
                        if (jVar2.emit(downloading, readsServiceImpl$prepareOptimizedRead$2$1$emit$1) != aVar) {
                            return zVar;
                        }
                    } else if (fileDownloadState instanceof FileDownloadState.Finished) {
                        ReadsServiceImpl readsServiceImpl = this.this$0;
                        String str = this.$readId;
                        File file = ((FileDownloadState.Finished) fileDownloadState).getFile();
                        readsServiceImpl$prepareOptimizedRead$2$1$emit$1.L$0 = null;
                        readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label = 2;
                        splitAndCacheIfNeeded = readsServiceImpl.splitAndCacheIfNeeded(str, file, readsServiceImpl$prepareOptimizedRead$2$1$emit$1);
                    } else {
                        c6.p();
                        return null;
                    }
                    return aVar;
                }
            }
            readsServiceImpl$prepareOptimizedRead$2$1$emit$1 = new ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1(this, cVar);
            Object obj2 = readsServiceImpl$prepareOptimizedRead$2$1$emit$1.result;
            i10 = readsServiceImpl$prepareOptimizedRead$2$1$emit$1.label;
            z zVar2 = z.f31622a;
            xn.a aVar2 = xn.a.f37986a;
            if (i10 == 0) {
            }
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((FileDownloadState) obj, (wn.c<? super z>) cVar);
        }
    }
}
