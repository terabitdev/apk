package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import com.revenuecat.purchases.utils.EventsFileHelper;
import fr.g0;
import ho.p;
import ho.q;
import hr.x;
import io.elevenlabs.data.services.ReadBookmarkServiceImpl;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConnectivityServiceKt;
import ir.m1;
import ir.r;
import ir.w;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2", f = "ReadBookmarkServiceImpl.kt", l = {100}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadBookmarkServiceImpl$sync$2 extends yn.i implements p {
    final /* synthetic */ String $readId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReadBookmarkServiceImpl this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1", f = "ReadBookmarkServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "<anonymous>", "()Lir/i;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.l {
        final /* synthetic */ String $readId;
        int label;
        final /* synthetic */ ReadBookmarkServiceImpl this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1$1", f = "ReadBookmarkServiceImpl.kt", l = {77, EventsFileHelper.MAX_EVENT_PROPERTY_SIZE, 81, 82, 83, 90}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00131 extends yn.i implements p {
            final /* synthetic */ String $readId;
            int I$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReadBookmarkServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00131(ReadBookmarkServiceImpl readBookmarkServiceImpl, String str, wn.c<? super C00131> cVar) {
                super(2, cVar);
                this.this$0 = readBookmarkServiceImpl;
                this.$readId = str;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00131 c00131 = new C00131(this.this$0, this.$readId, cVar);
                c00131.L$0 = obj;
                return c00131;
            }

            @Override // ho.p
            public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
                return ((C00131) create(jVar, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x00b0, code lost:
            
                if (((java.lang.Boolean) r7).booleanValue() != false) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
            
                if (r0.emit(r7, r6) == r3) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
            
                if (r7 == r3) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
            
                if (r7 == r3) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
            
                if (r7 == r3) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
            
                if (r7 == r3) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x003b, code lost:
            
                if (r0.emit(r7, r6) == r3) goto L40;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
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
                ir.j jVar = (ir.j) this.L$0;
                int i10 = this.label;
                int i11 = 1;
                xn.a aVar = xn.a.f37986a;
                switch (i10) {
                    case 0:
                        sn.a.g(obj);
                        SyncStatus syncStatus = SyncStatus.SYNCING;
                        this.L$0 = jVar;
                        this.label = 1;
                        break;
                    case 1:
                        sn.a.g(obj);
                        logger = this.this$0.logger;
                        str = this.this$0.tag;
                        ib.i.r("Bookmark sync started for readId: ", this.$readId, logger, str);
                        ReadBookmarkServiceImpl readBookmarkServiceImpl = this.this$0;
                        String str4 = this.$readId;
                        this.L$0 = jVar;
                        this.label = 2;
                        obj = readBookmarkServiceImpl.syncPendingCreates(str4, this);
                        break;
                    case 2:
                        sn.a.g(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ReadBookmarkServiceImpl readBookmarkServiceImpl2 = this.this$0;
                            String str5 = this.$readId;
                            this.L$0 = jVar;
                            this.label = 3;
                            obj = readBookmarkServiceImpl2.syncPendingDeletes(str5, this);
                            break;
                        }
                        i11 = 0;
                        if (i11 == 0) {
                            logger2 = this.this$0.logger;
                            str2 = this.this$0.tag;
                            Logger.logWarning$default(logger2, str2, defpackage.f.i("Bookmark sync failed for readId: ", this.$readId), null, 4, null);
                            throw new ReadBookmarkServiceImpl.BookmarkSyncException();
                        }
                        SyncStatus syncStatus2 = SyncStatus.READY;
                        this.L$0 = null;
                        this.I$0 = i11;
                        this.label = 6;
                        break;
                    case 3:
                        sn.a.g(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ReadBookmarkServiceImpl readBookmarkServiceImpl3 = this.this$0;
                            String str6 = this.$readId;
                            this.L$0 = jVar;
                            this.label = 4;
                            obj = readBookmarkServiceImpl3.syncPendingUpdates(str6, this);
                            break;
                        }
                        i11 = 0;
                        if (i11 == 0) {
                        }
                        break;
                    case 4:
                        sn.a.g(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ReadBookmarkServiceImpl readBookmarkServiceImpl4 = this.this$0;
                            String str7 = this.$readId;
                            this.L$0 = jVar;
                            this.label = 5;
                            obj = readBookmarkServiceImpl4.syncRemoteChanges(str7, this);
                            break;
                        }
                        i11 = 0;
                        if (i11 == 0) {
                        }
                        break;
                    case 5:
                        sn.a.g(obj);
                        break;
                    case 6:
                        sn.a.g(obj);
                        logger3 = this.this$0.logger;
                        str3 = this.this$0.tag;
                        ib.i.r("Bookmark sync completed successfully for readId: ", this.$readId, logger3, str3);
                        return z.f31622a;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1$2", f = "ReadBookmarkServiceImpl.kt", l = {94}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ParameterNames.CAUSE, ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReadBookmarkServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ReadBookmarkServiceImpl readBookmarkServiceImpl, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = readBookmarkServiceImpl;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // ho.p
            public final Object invoke(Throwable th, wn.c<? super Boolean> cVar) {
                return ((AnonymousClass2) create(th, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                Throwable th = (Throwable) this.L$0;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    logger = this.this$0.logger;
                    str = this.this$0.tag;
                    Logger.logWarning$default(logger, str, defpackage.f.i("Bookmark sync failed, will retry: ", th.getMessage()), null, 4, null);
                    xq.a aVar = xq.b.f38124b;
                    long n2 = xq.g.n(2, xq.d.SECONDS);
                    this.L$0 = null;
                    this.label = 1;
                    Object n10 = g0.n(n2, this);
                    xn.a aVar2 = xn.a.f37986a;
                    if (n10 == aVar2) {
                        return aVar2;
                    }
                }
                return Boolean.TRUE;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1$3", f = "ReadBookmarkServiceImpl.kt", l = {98}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends yn.i implements q {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReadBookmarkServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ReadBookmarkServiceImpl readBookmarkServiceImpl, wn.c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.this$0 = readBookmarkServiceImpl;
            }

            @Override // ho.q
            public final Object invoke(ir.j jVar, Throwable th, wn.c<? super z> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = jVar;
                return anonymousClass3.invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                ir.j jVar = (ir.j) this.L$0;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    logger = this.this$0.logger;
                    str = this.this$0.tag;
                    logger.log(str, "Sync failed after all retries");
                    SyncStatus syncStatus = SyncStatus.ERROR;
                    this.L$0 = null;
                    this.label = 1;
                    Object emit = jVar.emit(syncStatus, this);
                    xn.a aVar = xn.a.f37986a;
                    if (emit == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReadBookmarkServiceImpl readBookmarkServiceImpl, String str, wn.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = readBookmarkServiceImpl;
            this.$readId = str;
        }

        @Override // yn.a
        public final wn.c<z> create(wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$readId, cVar);
        }

        @Override // ho.l
        public final Object invoke(wn.c<? super ir.i> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sn.a.g(obj);
                return new w(r.C(new m1(new C00131(this.this$0, this.$readId, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadBookmarkServiceImpl$sync$2(ReadBookmarkServiceImpl readBookmarkServiceImpl, String str, wn.c<? super ReadBookmarkServiceImpl$sync$2> cVar) {
        super(2, cVar);
        this.this$0 = readBookmarkServiceImpl;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadBookmarkServiceImpl$sync$2 readBookmarkServiceImpl$sync$2 = new ReadBookmarkServiceImpl$sync$2(this.this$0, this.$readId, cVar);
        readBookmarkServiceImpl$sync$2.L$0 = obj;
        return readBookmarkServiceImpl$sync$2;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((ReadBookmarkServiceImpl$sync$2) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConnectivityService connectivityService;
        final x xVar = (x) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            connectivityService = this.this$0.connectivityService;
            ir.i whenConnected = ConnectivityServiceKt.whenConnected(connectivityService, new AnonymousClass1(this.this$0, this.$readId, null));
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.data.services.ReadBookmarkServiceImpl$sync$2.2
                public final Object emit(SyncStatus syncStatus, wn.c<? super z> cVar) {
                    Object c5 = ((hr.w) x.this).f12593d.c(syncStatus, cVar);
                    if (c5 == xn.a.f37986a) {
                        return c5;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((SyncStatus) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.L$0 = null;
            this.label = 1;
            Object collect = whenConnected.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
