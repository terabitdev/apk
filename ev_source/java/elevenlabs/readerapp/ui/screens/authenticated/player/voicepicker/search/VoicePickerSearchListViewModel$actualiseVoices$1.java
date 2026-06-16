package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ho.q;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
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
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1", f = "VoicePickerSearchListViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSearchListViewModel$actualiseVoices$1 extends i implements p {
    int label;
    final /* synthetic */ VoicePickerSearchListViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$3", f = "VoicePickerSearchListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lio/elevenlabs/domain/model/Voice;", "<unused var>", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$CommunityVoicesState;", "voices"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$3 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends i implements q {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(wn.c<? super AnonymousClass3> cVar) {
            super(3, cVar);
        }

        @Override // ho.q
        public final Object invoke(VoicePickerSearchListContract.CommunityVoicesState communityVoicesState, List<Voice> list, wn.c<? super List<Voice>> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
            anonymousClass3.L$0 = list;
            return anonymousClass3.invokeSuspend(z.f31622a);
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
    public VoicePickerSearchListViewModel$actualiseVoices$1(VoicePickerSearchListViewModel voicePickerSearchListViewModel, wn.c<? super VoicePickerSearchListViewModel$actualiseVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSearchListViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSearchListViewModel$actualiseVoices$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSearchListViewModel$actualiseVoices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            final z1 stateFlow = this.this$0.getStateFlow();
            ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$map$1$2", f = "VoicePickerSearchListViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    VoicePickerSearchListContract.CommunityVoicesState communityVoices = ((VoicePickerSearchListContract.State) obj).getCommunityVoices();
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    Object emit = jVar.emit(communityVoices, anonymousClass1);
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
            });
            voicePickerSharedRepository = this.this$0.sharedRepository;
            final ir.i voices = voicePickerSharedRepository.getVoices();
            d1 d1Var = new d1(o6, new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1$2", f = "VoicePickerSearchListViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
            }, new AnonymousClass3(null), 1);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
            this.label = 1;
            Object collect = d1Var.collect(anonymousClass4, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1$4 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4<T> implements j {
        final /* synthetic */ VoicePickerSearchListViewModel this$0;

        public AnonymousClass4(VoicePickerSearchListViewModel voicePickerSearchListViewModel) {
            this.this$0 = voicePickerSearchListViewModel;
        }

        public static final VoicePickerSearchListContract.State emit$lambda$0(Map map, VoicePickerSearchListContract.State state) {
            state.getClass();
            VoicePickerSearchListContract.CommunityVoicesState communityVoices = state.getCommunityVoices();
            List<Voice> items = state.getCommunityVoices().getItems();
            ArrayList arrayList = new ArrayList();
            for (T t10 : items) {
                if (!map.containsKey(((Voice) t10).getVoiceId())) {
                    arrayList.add(t10);
                }
            }
            return VoicePickerSearchListContract.State.copy$default(state, null, null, VoicePickerSearchListContract.CommunityVoicesState.copy$default(communityVoices, arrayList, 0, false, 6, null), null, false, 27, null);
        }

        public final Object emit(List<Voice> list, wn.c<? super z> cVar) {
            int H = a0.H(tn.p.a0(list, 10));
            if (H < 16) {
                H = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
            for (T t10 : list) {
                linkedHashMap.put(((Voice) t10).getVoiceId(), t10);
            }
            this.this$0.queueStateUpdate(new c(linkedHashMap, 0));
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((List<Voice>) obj, (wn.c<? super z>) cVar);
        }
    }
}
