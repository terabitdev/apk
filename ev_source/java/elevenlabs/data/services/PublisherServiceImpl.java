package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.PublisherApi;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.GetPublisherReadsResponse;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.model.response.ReaderPublisherProfileResponseModel;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.model.PublisherProfile;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.PublisherService;
import ir.m1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/services/PublisherServiceImpl;", "Lio/elevenlabs/domain/services/PublisherService;", "Lio/elevenlabs/data/api/PublisherApi;", "publisherApi", "<init>", "(Lio/elevenlabs/data/api/PublisherApi;)V", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "Lio/elevenlabs/domain/model/PublisherProfile;", "toDomain", "(Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;)Lio/elevenlabs/domain/model/PublisherProfile;", "", "id", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "getPublisherById", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "cursor", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/ReadMeta;", "getPublisherReadsPage", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/PublisherApi;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PublisherServiceImpl implements PublisherService {
    private final PublisherApi publisherApi;

    public PublisherServiceImpl(PublisherApi publisherApi) {
        publisherApi.getClass();
        this.publisherApi = publisherApi;
    }

    public static /* synthetic */ PageData a(GetPublisherReadsResponse getPublisherReadsResponse) {
        return getPublisherReadsPage$lambda$0(getPublisherReadsResponse);
    }

    public static final PageData getPublisherReadsPage$lambda$0(GetPublisherReadsResponse getPublisherReadsResponse) {
        getPublisherReadsResponse.getClass();
        List<ReadMetadataResponseModel> reads = getPublisherReadsResponse.getReads();
        ArrayList arrayList = new ArrayList(p.a0(reads, 10));
        Iterator<T> it = reads.iterator();
        while (it.hasNext()) {
            arrayList.add(ReadMappingKt.toDomain((ReadMetadataResponseModel) it.next()));
        }
        return new PageData(arrayList, getPublisherReadsResponse.getHasMore(), getPublisherReadsResponse.getNextCursor());
    }

    public final PublisherProfile toDomain(ReaderPublisherProfileResponseModel readerPublisherProfileResponseModel) {
        return new PublisherProfile(readerPublisherProfileResponseModel.getProfileId(), readerPublisherProfileResponseModel.getName(), new Date(readerPublisherProfileResponseModel.getCreatedAtUnix()), new Date(readerPublisherProfileResponseModel.getUpdatedAtUnix()), readerPublisherProfileResponseModel.getBio(), readerPublisherProfileResponseModel.getAvatarUrl(), readerPublisherProfileResponseModel.getDateOfBirth(), readerPublisherProfileResponseModel.getOrigin(), readerPublisherProfileResponseModel.getWebsiteLink(), readerPublisherProfileResponseModel.getSocialLinks(), readerPublisherProfileResponseModel.getPenName());
    }

    @Override // io.elevenlabs.domain.services.PublisherService
    public Object getPublisherById(String str, wn.c<? super ir.i> cVar) {
        final m1 m1Var = new m1(new PublisherServiceImpl$getPublisherById$2(this, str, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ PublisherServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2", f = "PublisherServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(ir.j jVar, PublisherServiceImpl publisherServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = publisherServiceImpl;
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
                                AsyncCallResult domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                                final PublisherServiceImpl publisherServiceImpl = this.this$0;
                                AsyncCallResult map = ApiResultExtensionKt.map(domain, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: INVOKE (r5v3 'map' io.elevenlabs.domain.model.AsyncCallResult) = 
                                      (r5v2 'domain' io.elevenlabs.domain.model.AsyncCallResult)
                                      (wrap:ho.l:0x0043: CONSTRUCTOR (r3v0 'publisherServiceImpl' io.elevenlabs.data.services.PublisherServiceImpl A[DONT_INLINE]) A[MD:(io.elevenlabs.data.services.PublisherServiceImpl):void (m), WRAPPED] (LINE:68) call: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$3$1.<init>(io.elevenlabs.data.services.PublisherServiceImpl):void type: CONSTRUCTOR)
                                     STATIC call: io.elevenlabs.data.extensions.ApiResultExtensionKt.map(io.elevenlabs.domain.model.AsyncCallResult, ho.l):io.elevenlabs.domain.model.AsyncCallResult A[DECLARE_VAR, MD:<T, R>:(io.elevenlabs.domain.model.AsyncCallResult<T>, ho.l):io.elevenlabs.domain.model.AsyncCallResult<R> (m)] (LINE:71) in method: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1.2.emit(java.lang.Object, wn.c):java.lang.Object, file: classes3.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$3$1, state: NOT_LOADED
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
                                    boolean r0 = r6 instanceof io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L13
                                    r0 = r6
                                    io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2$1 r0 = (io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2$1 r0 = new io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2$1
                                    r0.<init>(r6)
                                L18:
                                    java.lang.Object r6 = r0.result
                                    int r1 = r0.label
                                    r2 = 1
                                    if (r1 == 0) goto L34
                                    if (r1 != r2) goto L2d
                                    java.lang.Object r5 = r0.L$3
                                    ir.j r5 = (ir.j) r5
                                    java.lang.Object r5 = r0.L$1
                                    io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1$2$1 r5 = (io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                                    sn.a.g(r6)
                                    goto L61
                                L2d:
                                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                    com.google.protobuf.c6.x(r5)
                                    r5 = 0
                                    return r5
                                L34:
                                    sn.a.g(r6)
                                    ir.j r6 = r4.$this_unsafeFlow
                                    io.elevenlabs.data.model.ApiResult r5 = (io.elevenlabs.data.model.ApiResult) r5
                                    io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.toDomain(r5)
                                    io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$3$1 r1 = new io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$3$1
                                    io.elevenlabs.data.services.PublisherServiceImpl r3 = r4.this$0
                                    r1.<init>(r3)
                                    io.elevenlabs.domain.model.AsyncCallResult r5 = io.elevenlabs.data.extensions.ApiResultExtensionKt.map(r5, r1)
                                    r1 = 0
                                    r0.L$0 = r1
                                    r0.L$1 = r1
                                    r0.L$2 = r1
                                    r0.L$3 = r1
                                    r1 = 0
                                    r0.I$0 = r1
                                    r0.label = r2
                                    java.lang.Object r5 = r6.emit(r5, r0)
                                    xn.a r6 = xn.a.f37986a
                                    if (r5 != r6) goto L61
                                    return r6
                                L61:
                                    sn.z r5 = sn.z.f31622a
                                    return r5
                                */
                                throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.services.PublisherServiceImpl$getPublisherById$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, wn.c):java.lang.Object");
                            }
                        }

                        @Override // ir.i
                        public Object collect(ir.j jVar, wn.c cVar2) {
                            Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar2);
                            if (collect == xn.a.f37986a) {
                                return collect;
                            }
                            return z.f31622a;
                        }
                    };
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
                @Override // io.elevenlabs.domain.services.PublisherService
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object getPublisherReadsPage(String str, String str2, wn.c<? super AsyncCallResult<PageData<ReadMeta>>> cVar) {
                    PublisherServiceImpl$getPublisherReadsPage$1 publisherServiceImpl$getPublisherReadsPage$1;
                    int i10;
                    if (cVar instanceof PublisherServiceImpl$getPublisherReadsPage$1) {
                        publisherServiceImpl$getPublisherReadsPage$1 = (PublisherServiceImpl$getPublisherReadsPage$1) cVar;
                        int i11 = publisherServiceImpl$getPublisherReadsPage$1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            publisherServiceImpl$getPublisherReadsPage$1.label = i11 - Integer.MIN_VALUE;
                            PublisherServiceImpl$getPublisherReadsPage$1 publisherServiceImpl$getPublisherReadsPage$12 = publisherServiceImpl$getPublisherReadsPage$1;
                            Object obj = publisherServiceImpl$getPublisherReadsPage$12.result;
                            i10 = publisherServiceImpl$getPublisherReadsPage$12.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj);
                                PublisherApi publisherApi = this.publisherApi;
                                publisherServiceImpl$getPublisherReadsPage$12.L$0 = null;
                                publisherServiceImpl$getPublisherReadsPage$12.L$1 = null;
                                publisherServiceImpl$getPublisherReadsPage$12.label = 1;
                                obj = PublisherApi.getPublisherReads$default(publisherApi, str, str2, null, publisherServiceImpl$getPublisherReadsPage$12, 4, null);
                                xn.a aVar = xn.a.f37986a;
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(20));
                        }
                    }
                    publisherServiceImpl$getPublisherReadsPage$1 = new PublisherServiceImpl$getPublisherReadsPage$1(this, cVar);
                    PublisherServiceImpl$getPublisherReadsPage$1 publisherServiceImpl$getPublisherReadsPage$122 = publisherServiceImpl$getPublisherReadsPage$1;
                    Object obj2 = publisherServiceImpl$getPublisherReadsPage$122.result;
                    i10 = publisherServiceImpl$getPublisherReadsPage$122.label;
                    if (i10 == 0) {
                    }
                    return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(20));
                }
            }
