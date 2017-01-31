/* The authors of this work have released all rights to it and placed it
in the public domain under the Creative Commons CC0 1.0 waiver
(http://creativecommons.org/publicdomain/zero/1.0/).

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Retrieved from: http://en.literateprograms.org/Floyd's_cycle-finding_algorithm_(C)?oldid=7640
*/


#include<stdio.h>

typedef struct node_s {
	void *data;
	struct node_s *next;
} NODE;


int list_has_cycle(NODE *list)
{
	NODE *fast=list;
	while(1) {
		if(!(fast=fast->next)) return 0;
		if(fast==list) return 1;
		if(!(fast=fast->next)) return 0;
		if(fast==list) return 1;
		list=list->next;
	}
	return 0;
}

int main()
{
	NODE n1, n2, n3, n4, n5;

	n1.next=&n2;
	n2.next=&n3;
	n3.next=&n4;
	n4.next=&n5;
	n5.next=NULL;

	printf("Test without cycle: ");
	if(list_has_cycle(&n1)) printf("cycle\n");
	else printf("no cycle\n");

	n5.next=&n3;

	printf("Test with cycle: ");
	if(list_has_cycle(&n1)) printf("cycle\n");
	else printf("no cycle\n");
	
	return 0;
}
