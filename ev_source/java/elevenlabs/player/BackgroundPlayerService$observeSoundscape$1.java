package io.elevenlabs.player;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.player.audio.LoopingAudioPlayer;
import ir.i1;
import ir.j;
import ir.r;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1", f = "BackgroundPlayerService.kt", l = {422}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeSoundscape$1 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1$1", f = "BackgroundPlayerService.kt", l = {425, 437}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/player/BackgroundPlayerAction$SetSoundscape;", "action", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/player/BackgroundPlayerAction$SetSoundscape;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BackgroundPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerService;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(BackgroundPlayerAction.SetSoundscape setSoundscape, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(setSoundscape, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        
            if (r8.m1003startLoopingBWLJW6A(r2, r4, r6, r7) == r1) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
        
            if (r8.stop(r7) == r1) goto L20;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f10;
            BackgroundPlayerAction.SetSoundscape setSoundscape = (BackgroundPlayerAction.SetSoundscape) this.L$0;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        BackgroundPlayerService backgroundPlayerService = this.this$0;
                        f10 = backgroundPlayerService.currentSoundscapeMixingLevel;
                        backgroundPlayerService.updateSoundscapeSessionExtras(null, null, new Float(f10));
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ((m) obj).getClass();
                    this.this$0.updateSoundscapeSessionExtras(setSoundscape.getSoundscapeId(), setSoundscape.getFile(), new Float(setSoundscape.getMixingLevel()));
                }
            } else {
                sn.a.g(obj);
                String soundscapeId = setSoundscape.getSoundscapeId();
                xn.a aVar = xn.a.f37986a;
                if (soundscapeId != null && setSoundscape.getFile() != null) {
                    ib.i.r("Setting soundscape: ", setSoundscape.getSoundscapeId(), this.this$0.getLogger(), this.this$0.tag);
                    LoopingAudioPlayer loopingAudioPlayer = this.this$0.getLoopingAudioPlayer();
                    BackgroundPlayerService backgroundPlayerService2 = this.this$0;
                    File file = setSoundscape.getFile();
                    Float f11 = new Float(setSoundscape.getMixingLevel());
                    this.L$0 = setSoundscape;
                    this.label = 1;
                } else {
                    this.this$0.getLogger().log(this.this$0.tag, "Stopping soundscape (" + setSoundscape + Separators.RPAREN);
                    LoopingAudioPlayer loopingAudioPlayer2 = this.this$0.getLoopingAudioPlayer();
                    this.L$0 = setSoundscape;
                    this.label = 2;
                }
                return aVar;
            }
            this.this$0.currentSoundscapeId = setSoundscape.getSoundscapeId();
            this.this$0.currentSoundscapeFile = setSoundscape.getFile();
            this.this$0.currentSoundscapeMixingLevel = setSoundscape.getMixingLevel();
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observeSoundscape$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$observeSoundscape$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$observeSoundscape$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$observeSoundscape$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        final i1 i1Var;
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
            i1Var = this.this$0.actionsFlow;
            ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1$invokeSuspend$$inlined$filterIsInstance$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "BackgroundPlayerService.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeSoundscape$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    /* loaded from: classes3.dex */
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
                                    if (obj instanceof BackgroundPlayerAction.SetSoundscape) {
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
            });
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            Object l4 = r.l(o6, anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (l4 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
