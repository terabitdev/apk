package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CommunityVoicesPage;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import ir.r;
import ir.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1", f = "VoicePickerExploreViewModel.kt", l = {134, 177}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel$loadCommunityVoices$1 extends yn.i implements p {
    final /* synthetic */ int $page;
    Object L$0;
    int label;
    final /* synthetic */ VoicePickerExploreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerExploreViewModel$loadCommunityVoices$1(VoicePickerExploreViewModel voicePickerExploreViewModel, int i10, wn.c<? super VoicePickerExploreViewModel$loadCommunityVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerExploreViewModel;
        this.$page = i10;
    }

    public static final VoicePickerExploreContract.State invokeSuspend$lambda$0(VoicePickerExploreContract.State state) {
        return VoicePickerExploreContract.State.copy$default(state, null, state.getCommunityVoices().copy(t.f33547a, 0, false, false), null, 5, null);
    }

    public static final VoicePickerExploreContract.State invokeSuspend$lambda$1(VoicePickerExploreContract.State state) {
        return VoicePickerExploreContract.State.copy$default(state, null, VoicePickerExploreContract.CommunityVoicesState.copy$default(state.getCommunityVoices(), null, 0, true, false, 11, null), null, 5, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerExploreViewModel$loadCommunityVoices$1(this.this$0, this.$page, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerExploreViewModel$loadCommunityVoices$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        if (r8 == r5) goto L67;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ConnectivityService connectivityService;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return zVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            z1 sharedStateFlow = this.this$0.getSharedStateFlow();
            VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1 voicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1 = new VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1(null);
            this.label = 1;
            obj = r.t(sharedStateFlow, voicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1, this);
        }
        VoicePickerSharedContract.State state = (VoicePickerSharedContract.State) obj;
        VoicePickerSharedContract.ReadMetaState readMeta = state.getReadMeta();
        if (!(readMeta instanceof VoicePickerSharedContract.ReadMetaState.Absent) && !(readMeta instanceof VoicePickerSharedContract.ReadMetaState.Initial)) {
            if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Present) {
                if (!state.canChangeVoices()) {
                    this.this$0.queueStateUpdate(new f(0));
                    return zVar;
                }
            } else {
                c6.p();
                return null;
            }
        }
        if (!((VoicePickerExploreContract.State) this.this$0.getStateFlow().getValue()).getCommunityVoices().isLoading()) {
            this.this$0.queueStateUpdate(new f(1));
            connectivityService = this.this$0.connectivityService;
            final z1 isConnected = connectivityService.getIsConnected();
            final ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ ir.j $this_unsafeFlow;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$filter$1$2", f = "VoicePickerExploreViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    if (((Boolean) obj).booleanValue()) {
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
            final VoicePickerExploreViewModel voicePickerExploreViewModel = this.this$0;
            final int i11 = this.$page;
            ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$map$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements ir.j {
                    final /* synthetic */ int $page$inlined;
                    final /* synthetic */ ir.j $this_unsafeFlow;
                    final /* synthetic */ VoicePickerExploreViewModel this$0;

                    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$map$1$2", f = "VoicePickerExploreViewModel.kt", l = {51, 50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends yn.c {
                        int I$0;
                        int I$1;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        Object L$4;
                        Object L$5;
                        boolean Z$0;
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

                    public AnonymousClass2(ir.j jVar, VoicePickerExploreViewModel voicePickerExploreViewModel, int i10) {
                        this.$this_unsafeFlow = jVar;
                        this.this$0 = voicePickerExploreViewModel;
                        this.$page$inlined = i10;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c4, code lost:
                    
                        if (r4.emit(r1, r14) != r2) goto L24;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
                    @Override // ir.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, wn.c cVar) {
                        AnonymousClass1 anonymousClass1;
                        int i10;
                        CommunityVoicesService communityVoicesService;
                        xn.a aVar;
                        ir.j jVar;
                        int i11;
                        if (cVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) cVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i12 - Integer.MIN_VALUE;
                                AnonymousClass1 anonymousClass12 = anonymousClass1;
                                Object obj2 = anonymousClass12.result;
                                i10 = anonymousClass12.label;
                                Object obj3 = null;
                                xn.a aVar2 = xn.a.f37986a;
                                if (i10 == 0) {
                                    if (i10 != 1) {
                                        if (i10 == 2) {
                                            sn.a.g(obj2);
                                            return z.f31622a;
                                        }
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    int i13 = anonymousClass12.I$0;
                                    jVar = (ir.j) anonymousClass12.L$4;
                                    sn.a.g(obj2);
                                    i11 = i13;
                                    aVar = aVar2;
                                } else {
                                    sn.a.g(obj2);
                                    ir.j jVar2 = this.$this_unsafeFlow;
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    communityVoicesService = this.this$0.communityVoicesService;
                                    int i14 = this.$page$inlined;
                                    anonymousClass12.L$0 = null;
                                    anonymousClass12.L$1 = null;
                                    anonymousClass12.L$2 = null;
                                    anonymousClass12.L$3 = null;
                                    anonymousClass12.L$4 = jVar2;
                                    anonymousClass12.L$5 = null;
                                    anonymousClass12.I$0 = 0;
                                    anonymousClass12.Z$0 = booleanValue;
                                    anonymousClass12.I$1 = 0;
                                    anonymousClass12.label = 1;
                                    aVar = aVar2;
                                    Object communityVoices$default = CommunityVoicesService.getCommunityVoices$default(communityVoicesService, i14, 0, null, null, null, null, null, null, null, null, anonymousClass12, 1022, null);
                                    if (communityVoices$default != aVar) {
                                        jVar = jVar2;
                                        obj2 = communityVoices$default;
                                        i11 = 0;
                                        obj3 = null;
                                    }
                                    return aVar;
                                }
                                anonymousClass12.L$0 = obj3;
                                anonymousClass12.L$1 = obj3;
                                anonymousClass12.L$2 = obj3;
                                anonymousClass12.L$3 = obj3;
                                anonymousClass12.L$4 = obj3;
                                anonymousClass12.L$5 = obj3;
                                anonymousClass12.I$0 = i11;
                                anonymousClass12.label = 2;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(cVar);
                        AnonymousClass1 anonymousClass122 = anonymousClass1;
                        Object obj22 = anonymousClass122.result;
                        i10 = anonymousClass122.label;
                        Object obj32 = null;
                        xn.a aVar22 = xn.a.f37986a;
                        if (i10 == 0) {
                        }
                        anonymousClass122.L$0 = obj32;
                        anonymousClass122.L$1 = obj32;
                        anonymousClass122.L$2 = obj32;
                        anonymousClass122.L$3 = obj32;
                        anonymousClass122.L$4 = obj32;
                        anonymousClass122.L$5 = obj32;
                        anonymousClass122.I$0 = i11;
                        anonymousClass122.label = 2;
                    }
                }

                @Override // ir.i
                public Object collect(ir.j jVar, wn.c cVar) {
                    Object collect = ir.i.this.collect(new AnonymousClass2(jVar, voicePickerExploreViewModel, i11), cVar);
                    if (collect == xn.a.f37986a) {
                        return collect;
                    }
                    return z.f31622a;
                }
            });
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$page);
            this.L$0 = null;
            this.label = 2;
            if (o6.collect(anonymousClass5, this) == aVar) {
                return aVar;
            }
        }
        return zVar;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$5 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5<T> implements ir.j {
        final /* synthetic */ int $page;
        final /* synthetic */ VoicePickerExploreViewModel this$0;

        public AnonymousClass5(VoicePickerExploreViewModel voicePickerExploreViewModel, int i10) {
            this.this$0 = voicePickerExploreViewModel;
            this.$page = i10;
        }

        public static final VoicePickerExploreContract.State emit$lambda$0(int i10, VoicePickerExploreContract.State state) {
            state.getClass();
            return VoicePickerExploreContract.State.copy$default(state, null, VoicePickerExploreContract.CommunityVoicesState.copy$default(state.getCommunityVoices(), null, i10, false, false, 1, null), null, 5, null);
        }

        public static final VoicePickerExploreContract.State emit$lambda$1(AsyncCallResult asyncCallResult, int i10, VoicePickerExploreContract.State state) {
            state.getClass();
            VoicePickerExploreContract.CommunityVoicesState communityVoices = state.getCommunityVoices();
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            ArrayList O0 = o.O0(((CommunityVoicesPage) success.getData()).getVoices(), state.getCommunityVoices().getItems());
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((Voice) next).getVoiceId())) {
                    arrayList.add(next);
                }
            }
            return VoicePickerExploreContract.State.copy$default(state, null, communityVoices.copy(arrayList, i10, false, ((CommunityVoicesPage) success.getData()).getHasMore()), null, 5, null);
        }

        public final Object emit(AsyncCallResult<CommunityVoicesPage> asyncCallResult, wn.c<? super z> cVar) {
            Logger logger;
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                logger = this.this$0.logger;
                Logger.logWarning$default(logger, "VoicePickerExploreVM", "Error loading community voices: " + asyncCallResult, null, 4, null);
                VoicePickerExploreViewModel voicePickerExploreViewModel = this.this$0;
                final int i10 = this.$page;
                voicePickerExploreViewModel.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.g
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        VoicePickerExploreContract.State emit$lambda$0;
                        emit$lambda$0 = VoicePickerExploreViewModel$loadCommunityVoices$1.AnonymousClass5.emit$lambda$0(i10, (VoicePickerExploreContract.State) obj);
                        return emit$lambda$0;
                    }
                });
            } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                VoicePickerExploreViewModel voicePickerExploreViewModel2 = this.this$0;
                final int i11 = this.$page;
                final AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
                voicePickerExploreViewModel2.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.h
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        VoicePickerExploreContract.State emit$lambda$1;
                        emit$lambda$1 = VoicePickerExploreViewModel$loadCommunityVoices$1.AnonymousClass5.emit$lambda$1(AsyncCallResult.Success.this, i11, (VoicePickerExploreContract.State) obj);
                        return emit$lambda$1;
                    }
                });
            } else {
                c6.p();
                return null;
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<CommunityVoicesPage>) obj, (wn.c<? super z>) cVar);
        }
    }
}
