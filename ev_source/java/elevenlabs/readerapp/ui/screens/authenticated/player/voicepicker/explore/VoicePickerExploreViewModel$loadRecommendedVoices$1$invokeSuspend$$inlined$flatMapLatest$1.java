package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import a7.u;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.ExploreVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import ir.r;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1", f = "VoicePickerExploreViewModel.kt", l = {193, 189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1 extends yn.i implements q {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ VoicePickerExploreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, VoicePickerExploreViewModel voicePickerExploreViewModel) {
        super(3, cVar);
        this.this$0 = voicePickerExploreViewModel;
    }

    public final Object invoke(ir.j jVar, Boolean bool, wn.c<? super z> cVar) {
        VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1 voicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1 = new VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.this$0);
        voicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        voicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = bool;
        return voicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        if (ir.r.r(r0, r8, r7) != r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r8 == r4) goto L26;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar;
        ir.i uVar;
        ExploreVoicesService exploreVoicesService;
        ExploreVoicesService exploreVoicesService2;
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
            jVar = (ir.j) this.L$2;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            jVar = (ir.j) this.L$0;
            boolean booleanValue = ((Boolean) this.L$1).booleanValue();
            if (booleanValue) {
                final z1 sharedStateFlow = this.this$0.getSharedStateFlow();
                ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2", f = "VoicePickerExploreViewModel.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadRecommendedVoices$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                        VoicePickerMode mode = ((VoicePickerSharedContract.State) obj).getMode();
                                        if (mode != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(mode, anonymousClass1);
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
                    public Object collect(ir.j jVar2, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar2), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = jVar;
                this.L$3 = null;
                this.Z$0 = booleanValue;
                this.I$0 = 0;
                this.label = 1;
                obj = r.u(iVar, this);
            } else {
                uVar = new u(new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE), 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
            }
        }
        VoicePickerMode voicePickerMode = (VoicePickerMode) obj;
        if (voicePickerMode instanceof VoicePickerMode.VoicePicker) {
            exploreVoicesService2 = this.this$0.exploreVoicesService;
            uVar = exploreVoicesService2.observeReadExploreVoices(((VoicePickerMode.VoicePicker) voicePickerMode).getReadId());
        } else if (voicePickerMode instanceof VoicePickerMode.VoicesTab) {
            exploreVoicesService = this.this$0.exploreVoicesService;
            uVar = exploreVoicesService.observeHomeExploreVoices();
        } else {
            c6.p();
            return null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (Boolean) obj2, (wn.c<? super z>) obj3);
    }
}
