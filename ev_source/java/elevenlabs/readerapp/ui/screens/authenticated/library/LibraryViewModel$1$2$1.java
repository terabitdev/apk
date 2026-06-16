package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$2$1", f = "LibraryViewModel.kt", l = {68, 72}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class LibraryViewModel$1$2$1 extends yn.i implements ho.p {
    final /* synthetic */ Logger $logger;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LibraryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$1$2$1(Logger logger, LibraryViewModel libraryViewModel, wn.c<? super LibraryViewModel$1$2$1> cVar) {
        super(2, cVar);
        this.$logger = logger;
        this.this$0 = libraryViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        LibraryViewModel$1$2$1 libraryViewModel$1$2$1 = new LibraryViewModel$1$2$1(this.$logger, this.this$0, cVar);
        libraryViewModel$1$2$1.L$0 = obj;
        return libraryViewModel$1$2$1;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super sn.z> cVar) {
        return ((LibraryViewModel$1$2$1) create(jVar, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        if (fr.g0.n(r5, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r8.collect(r1, r7) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x007d -> B:11:0x001f). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        final ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                this.$logger.log(this.this$0.tag, "Sync operation completed");
                xq.a aVar3 = xq.b.f38124b;
                long n2 = xq.g.n(5, xq.d.SECONDS);
                this.L$0 = jVar;
                this.label = 2;
            }
        }
        sn.a.g(obj);
        if (fr.g0.z(getContext())) {
            this.$logger.log(this.this$0.tag, "Starting sync operation");
            aVar = this.this$0.readsService;
            final ir.i sync = ((ReadsService) aVar.get()).sync();
            ir.c0 F = ir.r.F(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$2$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$2$1$invokeSuspend$$inlined$filter$1$2", f = "LibraryViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends yn.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(wn.c cVar) {
                            super(cVar);
                        }

                        @Override // yn.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(ir.j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    @Override // ir.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, wn.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i10;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                i10 = anonymousClass1.label;
                                if (i10 == 0) {
                                    if (i10 == 1) {
                                        sn.a.g(obj2);
                                    } else {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    sn.a.g(obj2);
                                    ir.j jVar = this.$this_unsafeFlow;
                                    SyncStatus syncStatus = (SyncStatus) obj;
                                    if (syncStatus == SyncStatus.READY || syncStatus == SyncStatus.ERROR) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(obj, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                                return sn.z.f31622a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.result;
                        i10 = anonymousClass1.label;
                        if (i10 == 0) {
                        }
                        return sn.z.f31622a;
                    }
                }

                @Override // ir.i
                public Object collect(ir.j jVar2, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar2), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return sn.z.f31622a;
                }
            }, 1);
            ir.j jVar2 = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel$1$2$1.2
                public final Object emit(SyncStatus syncStatus, wn.c<? super sn.z> cVar) {
                    Object emit = ir.j.this.emit(syncStatus, cVar);
                    if (emit == xn.a.f37986a) {
                        return emit;
                    }
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((SyncStatus) obj2, (wn.c<? super sn.z>) cVar);
                }
            };
            this.L$0 = jVar;
            this.label = 1;
        } else {
            return sn.z.f31622a;
        }
    }
}
