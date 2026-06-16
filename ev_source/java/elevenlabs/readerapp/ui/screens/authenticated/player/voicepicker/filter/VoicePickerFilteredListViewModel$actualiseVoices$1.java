package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import ho.q;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.d1;
import ir.j;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1", f = "VoicePickerFilteredListViewModel.kt", l = {172}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerFilteredListViewModel$actualiseVoices$1 extends yn.i implements p {
    int label;
    final /* synthetic */ VoicePickerFilteredListViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$2", f = "VoicePickerFilteredListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lio/elevenlabs/domain/model/Voice;", "<unused var>", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$State;", "voices"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements q {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // ho.q
        public final Object invoke(VoicePickerFilteredListContract.State state, List<Voice> list, wn.c<? super List<Voice>> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = list;
            return anonymousClass2.invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                return list;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerFilteredListViewModel$actualiseVoices$1(VoicePickerFilteredListViewModel voicePickerFilteredListViewModel, wn.c<? super VoicePickerFilteredListViewModel$actualiseVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerFilteredListViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerFilteredListViewModel$actualiseVoices$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerFilteredListViewModel$actualiseVoices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicePickerSharedRepository voicePickerSharedRepository;
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
            z1 stateFlow = this.this$0.getStateFlow();
            voicePickerSharedRepository = this.this$0.sharedRepository;
            final ir.i voices = voicePickerSharedRepository.getVoices();
            d1 d1Var = new d1(stateFlow, r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1$2", f = "VoicePickerFilteredListViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    if (!((List) obj).isEmpty()) {
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
            }), new AnonymousClass2(null), 1);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
            this.label = 1;
            Object collect = d1Var.collect(anonymousClass3, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel$actualiseVoices$1$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3<T> implements j {
        final /* synthetic */ VoicePickerFilteredListViewModel this$0;

        public AnonymousClass3(VoicePickerFilteredListViewModel voicePickerFilteredListViewModel) {
            this.this$0 = voicePickerFilteredListViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VoicePickerFilteredListContract.State emit$lambda$0(Map map, VoicePickerFilteredListContract.State state) {
            state.getClass();
            List<Voice> items = state.getItems();
            ArrayList arrayList = new ArrayList(tn.p.a0(items, 10));
            for (Voice voice : items) {
                Voice voice2 = (Voice) map.get(voice.getVoiceId());
                if (voice2 != null) {
                    voice = voice2;
                }
                arrayList.add(voice);
            }
            return VoicePickerFilteredListContract.State.copy$default(state, arrayList, 0, false, null, false, 30, null);
        }

        public final Object emit(List<Voice> list, wn.c<? super z> cVar) {
            int H = a0.H(tn.p.a0(list, 10));
            if (H < 16) {
                H = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (T t10 : list) {
                linkedHashMap.put(((Voice) t10).getVoiceId(), t10);
            }
            this.this$0.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.i
                @Override // ho.l
                public final Object invoke(Object obj) {
                    VoicePickerFilteredListContract.State emit$lambda$0;
                    emit$lambda$0 = VoicePickerFilteredListViewModel$actualiseVoices$1.AnonymousClass3.emit$lambda$0(linkedHashMap, (VoicePickerFilteredListContract.State) obj);
                    return emit$lambda$0;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((List<Voice>) obj, (wn.c<? super z>) cVar);
        }
    }
}
