package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.BinarySearchList;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1", f = "PlayerViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1 extends yn.i implements ho.q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, PlayerViewModel playerViewModel) {
        super(3, cVar);
        this.this$0 = playerViewModel;
    }

    public final Object invoke(ir.j jVar, BinarySearchList binarySearchList, wn.c<? super sn.z> cVar) {
        PlayerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1 playerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1 = new PlayerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        playerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        playerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1.L$1 = binarySearchList;
        return playerViewModel$25$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            ir.j jVar = (ir.j) this.L$0;
            final BinarySearchList binarySearchList = (BinarySearchList) this.L$1;
            final ir.z1 stateFlow = this.this$0.getStateFlow();
            final jr.j G = ir.r.G(ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$1$2", f = "PlayerViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean z6;
                        ContentState contentState;
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
                                    PlayerState playerState = (PlayerState) obj;
                                    if (!playerState.isSeeking() && playerState.isAppInForeground() && (contentState = playerState.getContentState()) != null && !contentState.getResetToOffset()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    Boolean valueOf = Boolean.valueOf(z6);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(valueOf, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
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
            }), new PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$flatMapLatest$1(null, this.this$0));
            ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$2

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$2$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;
                    final /* synthetic */ BinarySearchList $wordOffsets$inlined;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$2$2", f = "PlayerViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$25$invokeSuspend$lambda$1$$inlined$map$2$2$1, reason: invalid class name */
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

                    public AnonymousClass2(ir.j jVar, BinarySearchList binarySearchList) {
                        this.$this_unsafeFlow = jVar;
                        this.$wordOffsets$inlined = binarySearchList;
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
                        Long findNearestLeftElement;
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
                                    long longValue = ((Number) obj).longValue();
                                    BinarySearchList binarySearchList = this.$wordOffsets$inlined;
                                    if (binarySearchList != null && (findNearestLeftElement = binarySearchList.findNearestLeftElement(longValue)) != null) {
                                        longValue = findNearestLeftElement.longValue();
                                    }
                                    Long l4 = new Long(longValue);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(l4, anonymousClass1);
                                    xn.a aVar = xn.a.f37986a;
                                    if (emit == aVar) {
                                        return aVar;
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
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar2, binarySearchList), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return sn.z.f31622a;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object r10 = ir.r.r(jVar, iVar, this);
            xn.a aVar = xn.a.f37986a;
            if (r10 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (BinarySearchList) obj2, (wn.c<? super sn.z>) obj3);
    }
}
