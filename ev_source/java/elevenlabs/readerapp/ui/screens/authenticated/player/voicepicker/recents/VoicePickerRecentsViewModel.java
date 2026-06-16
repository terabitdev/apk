package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents;

import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.RecentVoice;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ir.d1;
import ir.i;
import ir.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import tn.a0;
import tn.o;
import tn.p;
import wn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/recents/VoicePickerRecentsViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListBaseViewModel;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "sharedRepository", "Lio/elevenlabs/domain/services/RecentVoicesService;", "recentVoicesService", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ConnectivityService;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;Lio/elevenlabs/domain/services/RecentVoicesService;)V", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "syncVoices", "()Lir/i;", "", "Lio/elevenlabs/domain/model/Voice;", "observeVoices", "Lsn/z;", "onRetry", "()V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedRepository;", "Lio/elevenlabs/domain/services/RecentVoicesService;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerRecentsViewModel extends VoicesListBaseViewModel {
    public static final int $stable = 8;
    private final RecentVoicesService recentVoicesService;
    private final VoicePickerSharedRepository sharedRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicePickerRecentsViewModel(DispatcherFactory dispatcherFactory, ConnectivityService connectivityService, VoicePickerSharedRepository voicePickerSharedRepository, RecentVoicesService recentVoicesService) {
        super(dispatcherFactory, connectivityService, voicePickerSharedRepository);
        dispatcherFactory.getClass();
        connectivityService.getClass();
        voicePickerSharedRepository.getClass();
        recentVoicesService.getClass();
        this.sharedRepository = voicePickerSharedRepository;
        this.recentVoicesService = recentVoicesService;
        handleSyncVoices();
        handleObserveVoices();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeVoices$lambda$1(List list, List list2, c cVar) {
        return new k(list, list2);
    }

    @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel
    public i observeVoices() {
        final i voices = this.sharedRepository.getVoices();
        final d1 d1Var = new d1(new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$filter$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$filter$1$2", f = "VoicePickerRecentsViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
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
                public final Object emit(Object obj, c cVar) {
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
            public Object collect(j jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }, this.recentVoicesService.observeRecentVoices(), VoicePickerRecentsViewModel$observeVoices$4.INSTANCE, 1);
        return new i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                @e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2", f = "VoicePickerRecentsViewModel.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
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

                /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, c cVar) {
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
                                k kVar = (k) obj;
                                List list = (List) kVar.f31600a;
                                List list2 = (List) kVar.f31601b;
                                int H = a0.H(p.a0(list2, 10));
                                if (H < 16) {
                                    H = 16;
                                }
                                final LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                                for (T t10 : list2) {
                                    linkedHashMap.put(((RecentVoice) t10).getVoiceId(), t10);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (T t11 : list) {
                                    if (linkedHashMap.containsKey(((Voice) t11).getVoiceId())) {
                                        arrayList.add(t11);
                                    }
                                }
                                List a12 = o.a1(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009a: INVOKE (r7v6 'a12' java.util.List) = 
                                      (wrap:java.util.Comparator:0x0097: CONSTRUCTOR (r4v1 'linkedHashMap' java.util.LinkedHashMap A[DONT_INLINE]) A[MD:(java.util.Map):void (m), WRAPPED] (LINE:152) call: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$lambda$2$$inlined$sortedByDescending$1.<init>(java.util.Map):void type: CONSTRUCTOR)
                                      (r7v5 'arrayList' java.util.ArrayList)
                                     STATIC call: tn.o.a1(java.util.Comparator, java.lang.Iterable):java.util.List A[DECLARE_VAR, MD:(java.util.Comparator, java.lang.Iterable):java.util.List (m)] (LINE:155) in method: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes4.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$lambda$2$$inlined$sortedByDescending$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 33 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = r8 instanceof io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r8
                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2$1 r0 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2$1 r0 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2$1
                                    r0.<init>(r8)
                                L18:
                                    java.lang.Object r8 = r0.result
                                    int r1 = r0.label
                                    r2 = 1
                                    if (r1 == 0) goto L35
                                    if (r1 != r2) goto L2e
                                    java.lang.Object r7 = r0.L$3
                                    ir.j r7 = (ir.j) r7
                                    java.lang.Object r7 = r0.L$1
                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1$2$1 r7 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                                    sn.a.g(r8)
                                    goto Lb5
                                L2e:
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    com.google.protobuf.c6.x(r7)
                                    r7 = 0
                                    return r7
                                L35:
                                    sn.a.g(r8)
                                    ir.j r8 = r6.$this_unsafeFlow
                                    sn.k r7 = (sn.k) r7
                                    java.lang.Object r1 = r7.f31600a
                                    java.util.List r1 = (java.util.List) r1
                                    java.lang.Object r7 = r7.f31601b
                                    java.util.List r7 = (java.util.List) r7
                                    r3 = 10
                                    int r3 = tn.p.a0(r7, r3)
                                    int r3 = tn.a0.H(r3)
                                    r4 = 16
                                    if (r3 >= r4) goto L53
                                    r3 = r4
                                L53:
                                    java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                                    r4.<init>(r3)
                                    java.util.Iterator r7 = r7.iterator()
                                L5c:
                                    boolean r3 = r7.hasNext()
                                    if (r3 == 0) goto L71
                                    java.lang.Object r3 = r7.next()
                                    r5 = r3
                                    io.elevenlabs.domain.model.RecentVoice r5 = (io.elevenlabs.domain.model.RecentVoice) r5
                                    java.lang.String r5 = r5.getVoiceId()
                                    r4.put(r5, r3)
                                    goto L5c
                                L71:
                                    java.util.ArrayList r7 = new java.util.ArrayList
                                    r7.<init>()
                                    java.util.Iterator r1 = r1.iterator()
                                L7a:
                                    boolean r3 = r1.hasNext()
                                    if (r3 == 0) goto L95
                                    java.lang.Object r3 = r1.next()
                                    r5 = r3
                                    io.elevenlabs.domain.model.Voice r5 = (io.elevenlabs.domain.model.Voice) r5
                                    java.lang.String r5 = r5.getVoiceId()
                                    boolean r5 = r4.containsKey(r5)
                                    if (r5 == 0) goto L7a
                                    r7.add(r3)
                                    goto L7a
                                L95:
                                    io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$lambda$2$$inlined$sortedByDescending$1 r1 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$lambda$2$$inlined$sortedByDescending$1
                                    r1.<init>(r4)
                                    java.util.List r7 = tn.o.a1(r1, r7)
                                    r1 = 0
                                    r0.L$0 = r1
                                    r0.L$1 = r1
                                    r0.L$2 = r1
                                    r0.L$3 = r1
                                    r1 = 0
                                    r0.I$0 = r1
                                    r0.label = r2
                                    java.lang.Object r7 = r8.emit(r7, r0)
                                    xn.a r8 = xn.a.f37986a
                                    if (r7 != r8) goto Lb5
                                    return r8
                                Lb5:
                                    sn.z r7 = sn.z.f31622a
                                    return r7
                                */
                                throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel$observeVoices$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                            }
                        }

                        @Override // ir.i
                        public Object collect(j jVar, c cVar) {
                            Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return z.f31622a;
                        }
                    };
                }

                public final void onRetry() {
                    handleSyncVoices();
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel
                public i syncVoices() {
                    return this.recentVoicesService.syncRecentVoices();
                }
            }
