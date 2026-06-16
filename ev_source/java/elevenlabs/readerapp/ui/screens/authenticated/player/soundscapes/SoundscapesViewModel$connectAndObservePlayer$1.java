package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import t2.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1", f = "SoundscapesViewModel.kt", l = {232, 237}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SoundscapesViewModel$connectAndObservePlayer$1 extends yn.i implements p {
    int label;
    final /* synthetic */ SoundscapesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapesViewModel$connectAndObservePlayer$1(SoundscapesViewModel soundscapesViewModel, wn.c<? super SoundscapesViewModel$connectAndObservePlayer$1> cVar) {
        super(2, cVar);
        this.this$0 = soundscapesViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SoundscapesViewModel$connectAndObservePlayer$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SoundscapesViewModel$connectAndObservePlayer$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r0.collect(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r5 == r3) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PlayerService playerService;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            playerService = this.this$0.playerService;
            this.label = 1;
            obj = playerService.connect(this);
        }
        final ir.i iVar = (ir.i) obj;
        ir.i iVar2 = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1$invokeSuspend$$inlined$filter$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1$invokeSuspend$$inlined$filter$1$2", f = "SoundscapesViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                PlayerConnectionState playerConnectionState = (PlayerConnectionState) obj;
                                if (playerConnectionState == PlayerConnectionState.IDLE || playerConnectionState == PlayerConnectionState.READY) {
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
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$connectAndObservePlayer$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements ir.j {
        final /* synthetic */ SoundscapesViewModel this$0;

        public AnonymousClass2(SoundscapesViewModel soundscapesViewModel) {
            this.this$0 = soundscapesViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final SoundscapesContract.State emit$lambda$0(String str, File file, float f10, SoundscapesContract.State state) {
            Soundscape soundscape;
            boolean z6;
            Soundscape selectedSoundscape;
            File selectedSoundscapeFile;
            float mixerLevel;
            T t10;
            state.getClass();
            if (state.getOriginalSoundscape() != null) {
                return state;
            }
            String str2 = null;
            if (str != null) {
                Iterator<T> it = state.getAllSoundscapes().iterator();
                while (true) {
                    if (it.hasNext()) {
                        t10 = it.next();
                        if (kotlin.jvm.internal.m.c(((Soundscape) t10).getId(), str)) {
                            break;
                        }
                    } else {
                        t10 = (T) null;
                        break;
                    }
                }
                soundscape = t10;
            } else {
                soundscape = null;
            }
            if (soundscape == null) {
                return SoundscapesContract.State.copy$default(state, false, null, null, null, null, u.P, null, null, null, null, null, null, null, 6206, null);
            }
            if (state.getSelectedSoundscape() != null) {
                String id2 = state.getSelectedSoundscape().getId();
                Soundscape originalSoundscape = state.getOriginalSoundscape();
                if (originalSoundscape != null) {
                    str2 = originalSoundscape.getId();
                }
                if (!kotlin.jvm.internal.m.c(id2, str2) && !kotlin.jvm.internal.m.c(state.getSelectedSoundscape().getId(), soundscape.getId())) {
                    z6 = false;
                    if (!z6) {
                        selectedSoundscape = soundscape;
                    } else {
                        selectedSoundscape = state.getSelectedSoundscape();
                    }
                    if (!z6) {
                        selectedSoundscapeFile = file;
                    } else {
                        selectedSoundscapeFile = state.getSelectedSoundscapeFile();
                    }
                    if (!z6) {
                        mixerLevel = f10;
                    } else {
                        mixerLevel = state.getMixerLevel();
                    }
                    return SoundscapesContract.State.copy$default(state, false, null, null, null, null, mixerLevel, selectedSoundscape, selectedSoundscapeFile, soundscape, file, Float.valueOf(f10), null, null, 6174, null);
                }
            }
            z6 = true;
            if (!z6) {
            }
            if (!z6) {
            }
            if (!z6) {
            }
            return SoundscapesContract.State.copy$default(state, false, null, null, null, null, mixerLevel, selectedSoundscape, selectedSoundscapeFile, soundscape, file, Float.valueOf(f10), null, null, 6174, null);
        }

        public final Object emit(PlayerConnectionState playerConnectionState, wn.c<? super z> cVar) {
            PlayerService playerService;
            PlayerService playerService2;
            PlayerService playerService3;
            Logger logger;
            playerService = this.this$0.playerService;
            final String str = (String) playerService.getCurrentSoundscapeIdState().getValue();
            playerService2 = this.this$0.playerService;
            final File file = (File) playerService2.getCurrentSoundscapeFileState().getValue();
            playerService3 = this.this$0.playerService;
            final float floatValue = ((Number) playerService3.getCurrentSoundscapeMixingLevelState().getValue()).floatValue();
            logger = this.this$0.logger;
            ib.i.r("Retrieved current soundscape from player: ", str, logger, "SoundscapesViewModel");
            this.this$0.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.k
                @Override // ho.l
                public final Object invoke(Object obj) {
                    SoundscapesContract.State emit$lambda$0;
                    emit$lambda$0 = SoundscapesViewModel$connectAndObservePlayer$1.AnonymousClass2.emit$lambda$0(str, file, floatValue, (SoundscapesContract.State) obj);
                    return emit$lambda$0;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((PlayerConnectionState) obj, (wn.c<? super z>) cVar);
        }
    }
}
