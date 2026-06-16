package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.VoicesService;
import ir.d1;
import ir.z1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1", f = "VoiceDetailsScreen.kt", l = {243}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel$actualiseVoice$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ VoiceDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDetailsViewModel$actualiseVoice$1(VoiceDetailsViewModel voiceDetailsViewModel, wn.c<? super VoiceDetailsViewModel$actualiseVoice$1> cVar) {
        super(2, cVar);
        this.this$0 = voiceDetailsViewModel;
    }

    public static final /* synthetic */ Object invokeSuspend$lambda$1(List list, Voice voice, wn.c cVar) {
        return new sn.k(list, voice);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDetailsViewModel$actualiseVoice$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDetailsViewModel$actualiseVoice$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
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
            aVar = this.this$0.voicesService;
            ir.i voices = ((VoicesService) aVar.get()).voices();
            final z1 stateFlow = this.this$0.getStateFlow();
            final d1 d1Var = new d1(voices, new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "VoiceDetailsScreen.kt", l = {52}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends yn.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
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

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
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
                                    Voice voice = ((VoiceDetailsState) obj).getVoice();
                                    if (voice != null) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.L$4 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(voice, anonymousClass1);
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
            }, AnonymousClass4.INSTANCE, 1);
            ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$2

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$2$2", f = "VoiceDetailsScreen.kt", l = {53}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends yn.c {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
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
                        Object obj2;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                Object obj3 = anonymousClass1.result;
                                i10 = anonymousClass1.label;
                                if (i10 == 0) {
                                    if (i10 == 1) {
                                        sn.a.g(obj3);
                                    } else {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    sn.a.g(obj3);
                                    ir.j jVar = this.$this_unsafeFlow;
                                    sn.k kVar = (sn.k) obj;
                                    List list = (List) kVar.f31600a;
                                    Voice voice = (Voice) kVar.f31601b;
                                    Iterator<T> it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (kotlin.jvm.internal.m.c(((Voice) obj2).getVoiceId(), voice.getVoiceId())) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    if (obj2 != null) {
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.L$4 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(obj2, anonymousClass1);
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
                        Object obj32 = anonymousClass1.result;
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
            });
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0);
            this.label = 1;
            Object collect = o6.collect(anonymousClass6, this);
            xn.a aVar2 = xn.a.f37986a;
            if (collect == aVar2) {
                return aVar2;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$4 */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class AnonymousClass4 extends kotlin.jvm.internal.a implements ho.q {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, sn.k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // ho.q
        public final Object invoke(List<Voice> list, Voice voice, wn.c<? super sn.k> cVar) {
            return VoiceDetailsViewModel$actualiseVoice$1.invokeSuspend$lambda$1(list, voice, cVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel$actualiseVoice$1$6 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass6<T> implements ir.j {
        final /* synthetic */ VoiceDetailsViewModel this$0;

        public AnonymousClass6(VoiceDetailsViewModel voiceDetailsViewModel) {
            this.this$0 = voiceDetailsViewModel;
        }

        public static final VoiceDetailsState emit$lambda$0(Voice voice, VoiceDetailsState voiceDetailsState) {
            voiceDetailsState.getClass();
            return VoiceDetailsState.copy$default(voiceDetailsState, false, null, null, voice, false, false, false, null, 247, null);
        }

        public final Object emit(Voice voice, wn.c<? super z> cVar) {
            this.this$0.queueStateUpdate(new o(voice, 0));
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((Voice) obj, (wn.c<? super z>) cVar);
        }
    }
}
