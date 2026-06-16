package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerContract;
import ir.j;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$onEvent$1", f = "MiniPlayerViewModel.kt", l = {95, 98, 103}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class MiniPlayerViewModel$onEvent$1 extends i implements p {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ MiniPlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerViewModel$onEvent$1(MiniPlayerViewModel miniPlayerViewModel, wn.c<? super MiniPlayerViewModel$onEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = miniPlayerViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MiniPlayerViewModel$onEvent$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MiniPlayerViewModel$onEvent$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r14 == r5) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r14;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
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
                return zVar;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            final z1 observeQueueState = this.this$0.playerService.observeQueueState();
            ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$onEvent$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$onEvent$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$onEvent$1$invokeSuspend$$inlined$map$1$2", f = "MiniPlayerViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel$onEvent$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(j jVar) {
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
                        MediaItemState mediaItemState;
                        boolean z6;
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
                                    j jVar = this.$this_unsafeFlow;
                                    MediaQueueState mediaQueueState = (MediaQueueState) obj;
                                    if (mediaQueueState != null) {
                                        mediaItemState = mediaQueueState.getCurrentItem();
                                    } else {
                                        mediaItemState = null;
                                    }
                                    if (mediaItemState != null) {
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
                                return z.f31622a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        Object obj22 = anonymousClass1.result;
                        i10 = anonymousClass1.label;
                        if (i10 == 0) {
                        }
                        return z.f31622a;
                    }
                }

                @Override // ir.i
                public Object collect(j jVar, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return z.f31622a;
                }
            };
            this.label = 1;
            obj = r.w(iVar, this);
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            r14 = bool.booleanValue();
        } else {
            r14 = 0;
        }
        MiniPlayerViewModel miniPlayerViewModel = this.this$0;
        if (r14 != 0) {
            PlayerService playerService = miniPlayerViewModel.playerService;
            this.I$0 = r14;
            this.label = 2;
            if (playerService.togglePlayPause(this) == aVar) {
                return aVar;
            }
            return zVar;
        }
        ReadMeta item = ((MiniPlayerContract.DomainState) miniPlayerViewModel.getStateFlow().getValue()).getItem();
        if (item != null) {
            PlayerService playerService2 = this.this$0.playerService;
            long lastListenedCharOffset = item.getLastListenedCharOffset();
            String lastUsedVoiceId = item.getLastUsedVoiceId();
            this.L$0 = null;
            this.I$0 = r14;
            this.label = 3;
            if (playerService2.initPlayer(item, lastListenedCharOffset, true, lastUsedVoiceId, this) == aVar) {
            }
        }
        return zVar;
    }
}
