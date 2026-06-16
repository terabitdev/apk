package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.AuthorApi;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.AuthorSubpageResponse;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.PageData;
import io.elevenlabs.domain.services.AuthorService;
import ir.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0019\u0010\u000eJ\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001a\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/data/services/AuthorServiceImpl;", "Lio/elevenlabs/domain/services/AuthorService;", "Lio/elevenlabs/data/api/AuthorApi;", "authorApi", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/AuthorApi;Lio/elevenlabs/domain/Logger;)V", "", "authorId", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/AuthorProfile;", "getAuthorProfile", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "subpageId", "cursor", "", "pageSize", "sortKey", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "getAuthorSubpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "followAuthor", "unfollowAuthor", "Lio/elevenlabs/data/api/AuthorApi;", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AuthorServiceImpl implements AuthorService {
    private static final String TAG = "AuthorService";
    private final AuthorApi authorApi;
    private final Logger logger;

    public AuthorServiceImpl(AuthorApi authorApi, Logger logger) {
        authorApi.getClass();
        logger.getClass();
        this.authorApi = authorApi;
        this.logger = logger;
    }

    public static /* synthetic */ PageData a(AuthorSubpageResponse authorSubpageResponse) {
        return getAuthorSubpage$lambda$0(authorSubpageResponse);
    }

    public static final PageData getAuthorSubpage$lambda$0(AuthorSubpageResponse authorSubpageResponse) {
        AuthorProfileSection domain;
        authorSubpageResponse.getClass();
        List<io.elevenlabs.data.model.response.AuthorProfileSection> sections = authorSubpageResponse.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            domain = AuthorServiceImplKt.toDomain((io.elevenlabs.data.model.response.AuthorProfileSection) it.next());
            arrayList.add(domain);
        }
        return new PageData(arrayList, authorSubpageResponse.getHasMore(), authorSubpageResponse.getNextCursor());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.AuthorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object followAuthor(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        AuthorServiceImpl$followAuthor$1 authorServiceImpl$followAuthor$1;
        int i10;
        if (cVar instanceof AuthorServiceImpl$followAuthor$1) {
            authorServiceImpl$followAuthor$1 = (AuthorServiceImpl$followAuthor$1) cVar;
            int i11 = authorServiceImpl$followAuthor$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                authorServiceImpl$followAuthor$1.label = i11 - Integer.MIN_VALUE;
                Object obj = authorServiceImpl$followAuthor$1.result;
                i10 = authorServiceImpl$followAuthor$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("followAuthor - authorId=", str, this.logger, TAG);
                    AuthorApi authorApi = this.authorApi;
                    authorServiceImpl$followAuthor$1.L$0 = null;
                    authorServiceImpl$followAuthor$1.label = 1;
                    obj = authorApi.followAuthor(str, authorServiceImpl$followAuthor$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        authorServiceImpl$followAuthor$1 = new AuthorServiceImpl$followAuthor$1(this, cVar);
        Object obj2 = authorServiceImpl$followAuthor$1.result;
        i10 = authorServiceImpl$followAuthor$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    @Override // io.elevenlabs.domain.services.AuthorService
    public Object getAuthorProfile(String str, wn.c<? super ir.i> cVar) {
        this.logger.log(TAG, "getAuthorProfile - authorId=" + str);
        final m1 m1Var = new m1(new AuthorServiceImpl$getAuthorProfile$2(this, str, null));
        return new ir.i() { // from class: io.elevenlabs.data.services.AuthorServiceImpl$getAuthorProfile$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.AuthorServiceImpl$getAuthorProfile$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.AuthorServiceImpl$getAuthorProfile$$inlined$map$1$2", f = "AuthorServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.AuthorServiceImpl$getAuthorProfile$$inlined$map$1$2$1, reason: invalid class name */
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
                                AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), AuthorServiceImpl$getAuthorProfile$3$1.INSTANCE);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(map, anonymousClass1);
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
            public Object collect(ir.j jVar, wn.c cVar2) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar2);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // io.elevenlabs.domain.services.AuthorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAuthorSubpage(String str, String str2, String str3, Integer num, String str4, wn.c<? super AsyncCallResult<PageData<AuthorProfileSection>>> cVar) {
        AuthorServiceImpl$getAuthorSubpage$1 authorServiceImpl$getAuthorSubpage$1;
        int i10;
        if (cVar instanceof AuthorServiceImpl$getAuthorSubpage$1) {
            authorServiceImpl$getAuthorSubpage$1 = (AuthorServiceImpl$getAuthorSubpage$1) cVar;
            int i11 = authorServiceImpl$getAuthorSubpage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                authorServiceImpl$getAuthorSubpage$1.label = i11 - Integer.MIN_VALUE;
                AuthorServiceImpl$getAuthorSubpage$1 authorServiceImpl$getAuthorSubpage$12 = authorServiceImpl$getAuthorSubpage$1;
                Object obj = authorServiceImpl$getAuthorSubpage$12.result;
                i10 = authorServiceImpl$getAuthorSubpage$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    Logger logger = this.logger;
                    StringBuilder s10 = defpackage.f.s("getAuthorSubpage - authorId=", str, ", subpageId=", str2, ", cursor=");
                    s10.append(str3);
                    s10.append(", pageSize=");
                    s10.append(num);
                    s10.append(", sortKey=");
                    s10.append(str4);
                    logger.log(TAG, s10.toString());
                    AuthorApi authorApi = this.authorApi;
                    authorServiceImpl$getAuthorSubpage$12.L$0 = null;
                    authorServiceImpl$getAuthorSubpage$12.L$1 = null;
                    authorServiceImpl$getAuthorSubpage$12.L$2 = null;
                    authorServiceImpl$getAuthorSubpage$12.L$3 = null;
                    authorServiceImpl$getAuthorSubpage$12.L$4 = null;
                    authorServiceImpl$getAuthorSubpage$12.label = 1;
                    obj = authorApi.getAuthorSubpage(str, str2, str3, num, str4, authorServiceImpl$getAuthorSubpage$12);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(2));
            }
        }
        authorServiceImpl$getAuthorSubpage$1 = new AuthorServiceImpl$getAuthorSubpage$1(this, cVar);
        AuthorServiceImpl$getAuthorSubpage$1 authorServiceImpl$getAuthorSubpage$122 = authorServiceImpl$getAuthorSubpage$1;
        Object obj2 = authorServiceImpl$getAuthorSubpage$122.result;
        i10 = authorServiceImpl$getAuthorSubpage$122.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.AuthorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object unfollowAuthor(String str, wn.c<? super AsyncCallResult<z>> cVar) {
        AuthorServiceImpl$unfollowAuthor$1 authorServiceImpl$unfollowAuthor$1;
        int i10;
        if (cVar instanceof AuthorServiceImpl$unfollowAuthor$1) {
            authorServiceImpl$unfollowAuthor$1 = (AuthorServiceImpl$unfollowAuthor$1) cVar;
            int i11 = authorServiceImpl$unfollowAuthor$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                authorServiceImpl$unfollowAuthor$1.label = i11 - Integer.MIN_VALUE;
                Object obj = authorServiceImpl$unfollowAuthor$1.result;
                i10 = authorServiceImpl$unfollowAuthor$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("unfollowAuthor - authorId=", str, this.logger, TAG);
                    AuthorApi authorApi = this.authorApi;
                    authorServiceImpl$unfollowAuthor$1.L$0 = null;
                    authorServiceImpl$unfollowAuthor$1.label = 1;
                    obj = authorApi.unfollowAuthor(str, authorServiceImpl$unfollowAuthor$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        authorServiceImpl$unfollowAuthor$1 = new AuthorServiceImpl$unfollowAuthor$1(this, cVar);
        Object obj2 = authorServiceImpl$unfollowAuthor$1.result;
        i10 = authorServiceImpl$unfollowAuthor$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }
}
