package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.collections.ULongIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(mo6272bv = {1, 0, 3}, mo6273d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\u001b\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\t\u0010+\u001a\u00020,HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006."}, mo6274d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "size", "", "constructor-impl", "(I)[J", "storage", "", "([J)[J", "getSize-impl", "([J)I", "storage$annotations", "()V", "contains", "", "element", "contains-VKZWuLQ", "([JJ)Z", "containsAll", "elements", "containsAll-impl", "([JLjava/util/Collection;)Z", "equals", "other", "", "get", "index", "get-impl", "([JI)J", "hashCode", "isEmpty", "isEmpty-impl", "([J)Z", "iterator", "Lkotlin/collections/ULongIterator;", "iterator-impl", "([J)Lkotlin/collections/ULongIterator;", "set", "", "value", "set-k8EXiF4", "([JIJ)V", "toString", "", "Iterator", "kotlin-stdlib"}, mo6275k = 1, mo6276mv = {1, 1, 15})
/* compiled from: ULongArray.kt */
public final class ULongArray implements Collection<ULong>, KMappedMarker {
    private final long[] storage;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long[] m264constructorimpl(long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "storage");
        return jArr;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m267equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof ULongArray) && Intrinsics.areEqual(jArr, ((ULongArray) obj).m278unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m268equalsimpl0(long[] jArr, long[] jArr2) {
        Intrinsics.checkParameterIsNotNull(jArr, "p1");
        Intrinsics.checkParameterIsNotNull(jArr2, "p2");
        throw null;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m271hashCodeimpl(long[] jArr) {
        if (jArr != null) {
            return Arrays.hashCode(jArr);
        }
        return 0;
    }

    public static /* synthetic */ void storage$annotations() {
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m275toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ")";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(ULong uLong) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ  reason: not valid java name */
    public boolean m276addVKZWuLQ(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ULong> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public boolean m277containsVKZWuLQ(long j) {
        return m265containsVKZWuLQ(this.storage, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return m266containsAllimpl(this.storage, collection);
    }

    public boolean equals(Object obj) {
        return m267equalsimpl(this.storage, obj);
    }

    public int getSize() {
        return m270getSizeimpl(this.storage);
    }

    public int hashCode() {
        return m271hashCodeimpl(this.storage);
    }

    public boolean isEmpty() {
        return m272isEmptyimpl(this.storage);
    }

    /* Return type fixed from 'kotlin.collections.ULongIterator' to match base method */
    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<ULong> iterator() {
        return m273iteratorimpl(this.storage);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public String toString() {
        return m275toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long[] m278unboximpl() {
        return this.storage;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m277containsVKZWuLQ(((ULong) obj).m261unboximpl());
        }
        return false;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    private /* synthetic */ ULongArray(long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "storage");
        this.storage = jArr;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long[] m263constructorimpl(int i) {
        return m264constructorimpl(new long[i]);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final long m269getimpl(long[] jArr, int i) {
        return ULong.m218constructorimpl(jArr[i]);
    }

    /* renamed from: set-k8EXiF4  reason: not valid java name */
    public static final void m274setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: getSize-impl  reason: not valid java name */
    public static int m270getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: iterator-impl  reason: not valid java name */
    public static ULongIterator m273iteratorimpl(long[] jArr) {
        return new Iterator(jArr);
    }

    /* access modifiers changed from: private */
    @Metadata(mo6272bv = {1, 0, 3}, mo6273d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo6274d2 = {"Lkotlin/ULongArray$Iterator;", "Lkotlin/collections/ULongIterator;", "array", "", "([J)V", "index", "", "hasNext", "", "nextULong", "Lkotlin/ULong;", "()J", "kotlin-stdlib"}, mo6275k = 1, mo6276mv = {1, 1, 15})
    /* compiled from: ULongArray.kt */
    public static final class Iterator extends ULongIterator {
        private final long[] array;
        private int index;

        public Iterator(long[] jArr) {
            Intrinsics.checkParameterIsNotNull(jArr, "array");
            this.array = jArr;
        }

        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // kotlin.collections.ULongIterator
        public long nextULong() {
            int i = this.index;
            long[] jArr = this.array;
            if (i < jArr.length) {
                this.index = i + 1;
                return ULong.m218constructorimpl(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.index));
        }
    }

    /* renamed from: contains-VKZWuLQ  reason: not valid java name */
    public static boolean m265containsVKZWuLQ(long[] jArr, long j) {
        return ArraysKt.contains(jArr, j);
    }

    /* renamed from: containsAll-impl  reason: not valid java name */
    public static boolean m266containsAllimpl(long[] jArr, Collection<ULong> collection) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        Collection<ULong> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (T t : collection2) {
                if (!(t instanceof ULong) || !ArraysKt.contains(jArr, t.m261unboximpl())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl  reason: not valid java name */
    public static boolean m272isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }
}
