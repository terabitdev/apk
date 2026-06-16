package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import a2.g;
import com.google.firebase.sessions.s;
import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import ho.q;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceKt;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.h1;
import ir.j;
import ir.m1;
import ir.o;
import ir.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import tn.t;
import vq.f;
import wq.n;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1", f = "VoicePickerSearchListViewModel.kt", l = {179}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoicePickerSearchListViewModel$handleSearchQueryChanges$1 extends i implements p {
    int label;
    final /* synthetic */ VoicePickerSearchListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerSearchListViewModel$handleSearchQueryChanges$1(VoicePickerSearchListViewModel voicePickerSearchListViewModel, wn.c<? super VoicePickerSearchListViewModel$handleSearchQueryChanges$1> cVar) {
        super(2, cVar);
        this.this$0 = voicePickerSearchListViewModel;
    }

    public static final /* synthetic */ Object invokeSuspend$lambda$1(String str, List list, wn.c cVar) {
        return new k(str, list);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicePickerSearchListViewModel$handleSearchQueryChanges$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoicePickerSearchListViewModel$handleSearchQueryChanges$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicePickerSharedRepository voicePickerSharedRepository;
        VoicePickerSharedRepository voicePickerSharedRepository2;
        int i10 = this.label;
        z zVar = z.f31622a;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            voicePickerSharedRepository = this.this$0.sharedRepository;
            m1 m1Var = new m1(new o(new g(200L, 6), r.o(voicePickerSharedRepository.getSearchQueryFlow()), null));
            voicePickerSharedRepository2 = this.this$0.sharedRepository;
            final ir.i voices = voicePickerSharedRepository2.getVoices();
            ir.i iVar = new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$invokeSuspend$$inlined$filter$1$2", f = "VoicePickerSearchListViewModel.kt", l = {50}, m = "emit", v = 2)
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
            };
            AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0);
            this.label = 1;
            Object a10 = jr.b.a(h1.f17948a, new s(anonymousClass4, (wn.c) null, 3), anonymousClass5, this, new ir.i[]{m1Var, iVar});
            xn.a aVar = xn.a.f37986a;
            if (a10 != aVar) {
                a10 = zVar;
            }
            if (a10 == aVar) {
                return aVar;
            }
        }
        return zVar;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$4 */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class AnonymousClass4 extends kotlin.jvm.internal.a implements q {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        @Override // ho.q
        public final Object invoke(String str, List<Voice> list, wn.c<? super k> cVar) {
            return VoicePickerSearchListViewModel$handleSearchQueryChanges$1.invokeSuspend$lambda$1(str, list, cVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass5<T> implements j {
        final /* synthetic */ VoicePickerSearchListViewModel this$0;

        public AnonymousClass5(VoicePickerSearchListViewModel voicePickerSearchListViewModel) {
            this.this$0 = voicePickerSearchListViewModel;
        }

        public static final VoicePickerSearchListContract.State emit$lambda$0(VoicePickerSearchListViewModel voicePickerSearchListViewModel, String str, List list, VoicePickerSearchListContract.State state) {
            k kVar;
            state.getClass();
            MviViewModel.launch$default(voicePickerSearchListViewModel, null, new VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$1$1(voicePickerSearchListViewModel, str, null), 1, null);
            t tVar = t.f33547a;
            if (str != null) {
                f fVar = new f(tn.o.j0(list), true, new c(str, 1));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                vq.e eVar = new vq.e(fVar);
                while (eVar.hasNext()) {
                    Object next = eVar.next();
                    if (VoiceKt.isFavorited((Voice) next)) {
                        arrayList.add(next);
                    } else {
                        arrayList2.add(next);
                    }
                }
                kVar = new k(arrayList, arrayList2);
            } else {
                kVar = new k(tVar, tVar);
            }
            List list2 = (List) kVar.f31600a;
            return state.copy(tn.o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1$5$emit$lambda$0$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return wn.e.g(((Voice) t11).getFavoritedAtUnix(), ((Voice) t10).getFavoritedAtUnix());
                }
            }, list2), (List) kVar.f31601b, state.getCommunityVoices().copy(tVar, 0, true), str, true);
        }

        public static final boolean emit$lambda$0$0(String str, Voice voice) {
            voice.getClass();
            return VoiceKt.matchesSearchQuery(voice, str);
        }

        public final Object emit(k kVar, wn.c<? super z> cVar) {
            String obj;
            String str = (String) kVar.f31600a;
            final List list = (List) kVar.f31601b;
            final String str2 = null;
            if (str != null && (obj = n.L0(str).toString()) != null && obj.length() > 0) {
                str2 = obj;
            }
            final VoicePickerSearchListViewModel voicePickerSearchListViewModel = this.this$0;
            voicePickerSearchListViewModel.queueStateUpdate(new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.d
                @Override // ho.l
                public final Object invoke(Object obj2) {
                    VoicePickerSearchListContract.State emit$lambda$0;
                    emit$lambda$0 = VoicePickerSearchListViewModel$handleSearchQueryChanges$1.AnonymousClass5.emit$lambda$0(VoicePickerSearchListViewModel.this, str2, list, (VoicePickerSearchListContract.State) obj2);
                    return emit$lambda$0;
                }
            });
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((k) obj, (wn.c<? super z>) cVar);
        }
    }
}
